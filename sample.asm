global _start

	section .text
_start:
	; write(1, message, 15)
	mov	rax, 1			; system call 1 is write
	mov	rdi, 1			; file handle 1 is stdout
	mov	rsi, message		; address of bytes
	mov	rdx, 36			; number of bytes
	syscall				; invoke operating system to do the write

	; exit(0)
	mov	eax, 60			; system call 60 is exit
	xor	rdi, rdi		; exit code 0
	syscall				; invoke operating system to exit
message:
	db	"Hello My Name is Colby Brooks", 10	  ; note the neline at end

