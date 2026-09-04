/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a224
 * Address  : 0001a224
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a224(uint *param_1,uint param_2,uint param_3,int param_4,int param_5,int param_6,
                 int param_7)

{
  uint uVar1;
  byte *pbVar2;
  uint uVar3;
  undefined1 *puVar4;
  
  puVar4 = &stack0xfffffff8;
  if (param_3 <= -param_2 - 9) {
    pbVar2 = (byte *)param_1[2];
    if ((*param_1 & 1) == 0) {
      pbVar2 = (byte *)((int)param_1 + 1);
    }
    if (DAT_0001a2c8 < param_2) {
      uVar3 = 0xfffffff7;
    }
    else {
      param_3 = param_3 + param_2;
      if (param_3 <= param_2 * 2) {
        param_3 = param_2 << 1;
      }
      uVar3 = (param_3 | 7) + 1;
      if (param_3 < 0xb) {
        uVar3 = 0xb;
      }
    }
    uVar1 = FUN_000a0370(uVar3);
    if (param_5 != 0) {
      __aeabi_memmove(uVar1,pbVar2,param_5);
    }
    if (param_4 != param_6 + param_5) {
      __aeabi_memmove(uVar1 + param_5 + param_7,pbVar2 + param_6 + param_5,
                      param_4 - (param_6 + param_5),param_6,puVar4);
    }
    if (param_2 != 10) {
      FUN_00023f68(pbVar2);
    }
    param_1[2] = uVar1;
    *param_1 = uVar3 | 1;
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_00019fd0();
}


