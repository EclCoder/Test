/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023474
 * Address  : 00023474
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023474(int param_1,undefined4 param_2)

{
  uint uVar1;
  int iVar2;
  undefined4 uVar3;
  
  FUN_000203aa(param_2,0x28);
  FUN_000205b8(param_1 + 0xc,param_2);
  FUN_000203fa(param_2,0x29);
  (**(code **)(**(int **)(param_1 + 8) + 0x14))(*(int **)(param_1 + 8),param_2);
  uVar1 = *(uint *)(param_1 + 0x14);
  if ((uVar1 & 1) != 0) {
    FUN_0001dcd6(param_2,DAT_00023510 + 0x234b0,6);
    uVar1 = *(uint *)(param_1 + 0x14);
  }
  if ((int)(uVar1 << 0x1e) < 0) {
    FUN_0001dcd6(param_2,DAT_00023514 + 0x234c2,9);
    uVar1 = *(uint *)(param_1 + 0x14);
  }
  if ((int)(uVar1 << 0x1d) < 0) {
    FUN_0001dcd6(param_2,DAT_00023518 + 0x234d4,9);
  }
  if (*(char *)(param_1 + 0x18) == '\x01') {
    uVar3 = 2;
    iVar2 = DAT_0002351c + 0x234f0;
  }
  else {
    if (*(char *)(param_1 + 0x18) != '\x02') goto LAB_000234f4;
    uVar3 = 3;
    iVar2 = DAT_00023520 + 0x234e8;
  }
  FUN_0001dcd6(param_2,iVar2,uVar3);
LAB_000234f4:
  if (*(int *)(param_1 + 0x1c) != 0) {
    FUN_0001bdc8(param_2,0x20);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x1c),param_2);
    return;
  }
  return;
}


