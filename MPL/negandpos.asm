%macro printdata 2

	mov eax, 4
	mov ebx, 1
	mov ecx, %1
	mov edx, %2
	int 0x80

%endmacro 

section .data
	
	var db '1'
	arr db '-1', '2', '3'

section .bss

section .code
global _start
_start:

	printdata var, 1
	
	mov eax, 1
	mov ebx, 0
	int 0x80
