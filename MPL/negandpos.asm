%macro printdata 2

	mov eax, 4
	mov ebx, 1
	mov ecx, %1
	mov edx, %2
	int 0x80

%endmacro 

section .data
	
	var db '1'
	arr db 2, 4, 3, 5, 6, 8
	arr1 db 1
	ptr_var db '0'
	trueval db 'negative value'
	falseval db 'positive value'
	flen equ $-falseval
	tlen equ $-trueval
		

section .bss

section .code
global _start
_start:
	
	mov rbx, 0
	mov rdx, 6
	push rax
	push rbx
	push rdx
	push rcx	
	mov eax, [arr1]
	rol eax, 1
	jc printdata trueval, tlen
	pop rcx
	pop rdx
	pop rbx	
	pop rax	
	
	printloop:
		mov rax, [arr+rbx]
		add rax, '0'
		mov [ptr_var], rax
		push rax
		push rcx
		push rdx
		push rbx
		printdata ptr_var, 1
		pop rbx
		pop rdx
		pop rcx
		pop rax
		inc rbx
		dec rdx
		jnz printloop
		
	mov eax, 1
	mov ebx, 0
	int 0x80
