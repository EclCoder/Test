/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002177e
 * Address  : 0002177e
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002177e(int param_1,undefined4 param_2)

{
  char *pcVar1;
  int iVar2;
  
  FUN_000203aa(param_2,0x28);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  FUN_000203fa(param_2,0x29);
  pcVar1 = *(char **)(param_1 + 0xc);
  if (*pcVar1 == 'n') {
    FUN_0001bdc8(param_2,0x2d);
    iVar2 = *(int *)(param_1 + 0x10) + -1;
    pcVar1 = (char *)(*(int *)(param_1 + 0xc) + 1);
  }
  else {
    iVar2 = *(int *)(param_1 + 0x10);
  }
  FUN_0001dcd6(param_2,pcVar1,iVar2);
  return;
}


