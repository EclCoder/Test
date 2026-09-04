/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00026272
 * Address  : 00026272
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined8 FUN_00026272(uint param_1,uint param_2,uint param_3,uint param_4,int *param_5)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  uint local_18;
  uint uStack_14;
  
  uVar1 = (int)param_2 >> 0x1f;
  uVar2 = (int)param_4 >> 0x1f;
  local_18 = param_3;
  uStack_14 = param_4;
  uVar3 = FUN_000262cc((param_1 ^ uVar1) - uVar1,
                       ((param_2 ^ uVar1) - uVar1) - (uint)((param_1 ^ uVar1) < uVar1),
                       (param_3 ^ uVar2) - uVar2,
                       ((param_4 ^ uVar2) - uVar2) - (uint)((param_3 ^ uVar2) < uVar2),&local_18,
                       param_2);
  *param_5 = (local_18 ^ uVar1) - uVar1;
  param_5[1] = ((uStack_14 ^ uVar1) - uVar1) - (uint)((local_18 ^ uVar1) < uVar1);
  uVar2 = (int)(param_4 ^ param_2) >> 0x1f;
  uVar1 = (uint)uVar3 ^ uVar2;
  return CONCAT44((((uint)((ulonglong)uVar3 >> 0x20) ^ uVar2) - uVar2) - (uint)(uVar1 < uVar2),
                  uVar1 - uVar2);
}


