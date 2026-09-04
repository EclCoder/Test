/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001ab58
 * Address  : 0001ab58
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001ab58(undefined8 *param_1,int *param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 auStack_24 [12];
  
  if (*param_2 != 0) {
    iVar1 = FUN_0001acc8(param_3);
    if (iVar1 == 0) {
      FUN_0001a414(param_3,DAT_0001abc0 + 0x1ab7c);
    }
    (**(code **)(*(int *)param_2[1] + 0x18))(auStack_24,(int *)param_2[1],*param_2);
    FUN_0001acde(param_3,auStack_24);
    FUN_00019fe0(auStack_24);
  }
  uVar2 = *param_3;
  *(undefined4 *)param_3 = 0;
  *(undefined4 *)((int)param_3 + 4) = 0;
  *(undefined4 *)(param_1 + 1) = *(undefined4 *)(param_3 + 1);
  *param_1 = uVar2;
  *(undefined4 *)(param_3 + 1) = 0;
  return;
}


