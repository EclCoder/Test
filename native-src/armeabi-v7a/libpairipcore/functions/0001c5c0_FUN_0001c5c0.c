/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001c5c0
 * Address  : 0001c5c0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001c5c0(undefined4 *param_1,undefined4 *param_2,int param_3)

{
  int iVar1;
  byte *pbVar2;
  byte *pbVar3;
  byte *pbVar4;
  byte *pbVar5;
  
  pbVar3 = (byte *)*param_2;
  pbVar4 = (byte *)param_2[1];
  pbVar2 = pbVar3;
  if (param_3 == 0) {
LAB_0001c5de:
    if ((pbVar4 != pbVar2) && (0xfffffff5 < *pbVar2 - 0x3a)) {
      while ((pbVar5 = pbVar4, pbVar2 != pbVar4 && (pbVar5 = pbVar2, 0xfffffff5 < *pbVar2 - 0x3a)))
      {
        pbVar2 = pbVar2 + 1;
        *param_2 = pbVar2;
      }
      iVar1 = (int)pbVar5 - (int)pbVar3;
      goto LAB_0001c60a;
    }
  }
  else if (pbVar3 != pbVar4) {
    if (*pbVar3 == 0x6e) {
      pbVar2 = pbVar3 + 1;
      *param_2 = pbVar2;
    }
    goto LAB_0001c5de;
  }
  pbVar3 = (byte *)0x0;
  iVar1 = 0;
LAB_0001c60a:
  *param_1 = pbVar3;
  param_1[1] = iVar1;
  return;
}


