%macro printdata 2

	mov eax, 4
	mov ebx, 1
	mov ecx, %1
	mov edx, %2
	int 0x80

%endmacro 

section .data
	
	var db '1'
	arr db 2, 4, 3
	arr1 db -1
	ptr_var db '0'	

section .bss

section .code
global _start
_start:
	
	mov ebx, 0
	mov edx, 3

	printloop:
		mov eax, [arr+ebx]
		inc ebx
		add eax, '0'
		mov [ptr_var], eax
		printdata ptr_var, 1
	
		add edx, '0'
		mov [arr1], edx
		printdata arr1, 1
		
		jnz printloop
	
	mov eax, 1
	mov ebx, 0
	int 0x80
