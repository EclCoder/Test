/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00022af4
 * Address  : 00022af4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00022af4(int param_1,undefined4 param_2)

{
  int *piVar1;
  uint uVar2;
  int iVar3;
  undefined4 uVar4;
  
  FUN_000203aa(param_2,0x28);
  FUN_000205b8(param_1 + 0x10,param_2);
  FUN_000203fa(param_2,0x29);
  piVar1 = *(int **)(param_1 + 8);
  if (piVar1 != (int *)0x0) {
    (**(code **)(*piVar1 + 0x14))(piVar1,param_2);
  }
  uVar2 = *(uint *)(param_1 + 0x20);
  if ((uVar2 & 1) != 0) {
    FUN_0001dcd6(param_2,DAT_00022ba0 + 0x22b32,6);
    uVar2 = *(uint *)(param_1 + 0x20);
  }
  if ((int)(uVar2 << 0x1e) < 0) {
    FUN_0001dcd6(param_2,DAT_00022ba4 + 0x22b44,9);
    uVar2 = *(uint *)(param_1 + 0x20);
  }
  if ((int)(uVar2 << 0x1d) < 0) {
    FUN_0001dcd6(param_2,DAT_00022ba8 + 0x22b56,9);
  }
  if (*(char *)(param_1 + 0x24) == '\x01') {
    uVar4 = 2;
    iVar3 = DAT_00022bac + 0x22b74;
  }
  else {
    if (*(char *)(param_1 + 0x24) != '\x02') goto LAB_00022b78;
    uVar4 = 3;
    iVar3 = DAT_00022bb0 + 0x22b6c;
  }
  FUN_0001dcd6(param_2,iVar3,uVar4);
LAB_00022b78:
  if (*(int *)(param_1 + 0x18) != 0) {
    FUN_0001bd9c(*(int *)(param_1 + 0x18),param_2);
  }
  if (*(int *)(param_1 + 0x1c) != 0) {
    FUN_0001dcd6(param_2,DAT_00022bb4 + 0x22b90,10);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x1c),param_2);
    return;
  }
  return;
}


