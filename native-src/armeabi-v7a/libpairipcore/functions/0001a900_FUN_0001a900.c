/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a900
 * Address  : 0001a900
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a900(undefined4 *param_1,undefined1 *param_2,undefined1 *param_3,undefined4 param_4,
                 int param_5,uint param_6)

{
  undefined4 uVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  bool bVar4;
  undefined8 uVar5;
  
  puVar2 = param_2;
  if ((0x7fffffff < param_6) && (param_2 != param_3)) {
    bVar4 = param_5 != 0;
    param_5 = -param_5;
    param_6 = -(uint)bVar4 - param_6;
    puVar2 = param_2 + 1;
    *param_2 = 0x2d;
  }
  puVar3 = puVar2;
  if (((int)param_3 - (int)puVar2 < 0x14) &&
     (uVar5 = FUN_0001a96c(param_5,param_6), puVar3 = (undefined1 *)((ulonglong)uVar5 >> 0x20),
     (int)param_3 - (int)puVar2 < (int)uVar5)) {
    uVar1 = 0x4b;
  }
  else {
    param_3 = (undefined1 *)FUN_0001a9bc(puVar2,puVar3,param_5,param_6);
    uVar1 = 0;
  }
  *param_1 = param_3;
  param_1[1] = uVar1;
  return;
}


