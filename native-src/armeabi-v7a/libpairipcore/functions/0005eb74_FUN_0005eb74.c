/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005eb74
 * Address  : 0005eb74
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005eb74(int *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  
  puVar1 = (undefined8 *)*param_1;
  uVar3 = *param_2;
  *(undefined4 *)(puVar1 + 1) = *(undefined4 *)(param_2 + 1);
  *puVar1 = uVar3;
  uVar2 = *(undefined4 *)((int)param_2 + 0x14);
  *(undefined4 *)param_2 = 0;
  *(undefined4 *)((int)param_2 + 4) = 0;
  *(undefined4 *)(param_2 + 1) = 0;
  *(undefined4 *)(puVar1 + 2) = *(undefined4 *)(param_2 + 2);
  *(undefined4 *)((int)puVar1 + 0x14) = uVar2;
  uVar3 = param_2[3];
  *(undefined4 *)(puVar1 + 4) = *(undefined4 *)(param_2 + 4);
  puVar1[3] = uVar3;
  *(undefined4 *)(param_2 + 3) = 0;
  *(undefined4 *)((int)param_2 + 0x1c) = 0;
  *(undefined4 *)(param_2 + 4) = 0;
  return;
}


