/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0006023c
 * Address  : 0006023c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0006023c(undefined8 *param_1,undefined4 param_2,byte *param_3)

{
  byte bVar1;
  undefined8 uVar2;
  
  if ((*param_3 & 1) == 0) {
    uVar2 = *(undefined8 *)param_3;
    *(undefined4 *)(param_1 + 1) = *(undefined4 *)(param_3 + 8);
    *param_1 = uVar2;
  }
  else {
    FUN_000289d4(param_1,*(undefined4 *)(param_3 + 8),*(undefined4 *)(param_3 + 4));
  }
  bVar1 = param_3[0x18];
  *(undefined4 *)(param_1 + 2) = *(undefined4 *)(param_3 + 0x10);
  *(undefined4 *)((int)param_1 + 0x14) = *(undefined4 *)(param_3 + 0x14);
  if ((bVar1 & 1) == 0) {
    uVar2 = *(undefined8 *)(param_3 + 0x18);
    *(undefined4 *)(param_1 + 4) = *(undefined4 *)(param_3 + 0x20);
    param_1[3] = uVar2;
    return;
  }
  FUN_000289d4(param_1 + 3,*(undefined4 *)(param_3 + 0x20),*(undefined4 *)(param_3 + 0x1c));
  return;
}


