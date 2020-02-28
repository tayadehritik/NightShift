%macro printdata 2

	mov rax, 4
	mov rbx, 1
	mov rcx, %1
	mov rdx, %2
	int 0x80

%endmacro

section .data

	arr64		dq	-0000000011111111H, 22222222H, -33333333H, 44444444H, 55555555H
	printvar db '0'
	mess db "negative"
	messlen equ $-mess

section .bss

section .text
global _start
_start:

	mov rsi, arr64
	inc rsi	
	mov rax, [rsi]
	rol rax, 1
	
	mov rax, 1
	mov rbx, 0
	int 0x80
