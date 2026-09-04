/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001dd58
 * Address  : 0001dd58
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0001dd58(int *param_1,int param_2,undefined4 param_3,uint param_4)

{
  int iVar1;
  undefined4 uVar2;
  int local_1c;
  uint uStack_18;
  uint local_14;
  
  local_1c = param_2;
  uStack_18 = param_3;
  local_14 = param_4;
  iVar1 = FUN_0001ddac(param_1,&local_14,param_3,param_4,param_1);
  if (((iVar1 == 0) && (local_1c = *param_1, local_14 <= (uint)(param_1[1] - local_1c))) &&
     (local_14 != 0)) {
    uStack_18 = local_14;
    *param_1 = local_1c + local_14;
    iVar1 = FUN_0001d2b8(local_1c,local_14,DAT_0001dda4 + 0x1dd84,10);
    if (iVar1 != 0) {
      uVar2 = FUN_0001de04(param_1,DAT_0001dda8 + 0x1dd90);
      return uVar2;
    }
    uVar2 = FUN_0001de44(param_1,&local_1c);
    return uVar2;
  }
  return 0;
}


