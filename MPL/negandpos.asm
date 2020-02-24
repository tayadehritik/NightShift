%macro printdata 2

	mov rax, 4
	mov rbx, 1
	mov rcx, %1
	mov rdx, %2
	int 0x80

%endmacro

section .data

	arr db 3, 4, 5, 1, 2
	printvar db '0'
	mess db "negative"
	messlen equ $-mess

section .bss

section .text
global _start
_start:
	mov rax, [arr]
	ror rax, 1	
	mov [printvar], rax	
	printdata printvar, 1
	mov rax, 1
	mov rbx, 0
	int 0x80
