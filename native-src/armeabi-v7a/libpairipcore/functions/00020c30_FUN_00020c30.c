/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020c30
 * Address  : 00020c30
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00020c30(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  char *pcVar2;
  int iVar3;
  
  if (3 < *(uint *)(param_1 + 0xc)) {
    FUN_000203aa(param_2,0x28);
    uVar1 = FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
    FUN_000203fa(uVar1,0x29);
  }
  pcVar2 = *(char **)(param_1 + 0x10);
  if (*pcVar2 == 'n') {
    FUN_0001bdc8(param_2,0x2d);
    iVar3 = *(int *)(param_1 + 0x14) + -1;
    pcVar2 = (char *)(*(int *)(param_1 + 0x10) + 1);
  }
  else {
    iVar3 = *(int *)(param_1 + 0x14);
  }
  FUN_0001dcd6(param_2,pcVar2,iVar3);
  if (3 < *(uint *)(param_1 + 0xc)) {
    return;
  }
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8));
  return;
}


