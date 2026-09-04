/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024a88
 * Address  : 00024a88
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00024a88(undefined4 param_1,undefined4 param_2,int param_3,code *param_4,undefined4 param_5
                 )

{
  int iVar1;
  undefined4 local_40 [3];
  code *local_34;
  undefined4 local_2c;
  undefined4 local_20;
  
  FUN_00024b54(param_2,param_1);
  while( true ) {
    iVar1 = FUN_00024ca8(param_2,local_40);
    if (iVar1 != 0) {
      return;
    }
    iVar1 = (*param_4)(1,10,param_3,param_3,param_2,param_5);
    if (iVar1 != 0) break;
    if (local_34 != (code *)0x0) {
      *(undefined4 *)(param_3 + 0x48) = local_40[0];
      *(undefined4 *)(param_3 + 0x4c) = local_20;
      *(undefined4 *)(param_3 + 0x50) = local_2c;
      iVar1 = (*local_34)(9,param_3,param_2);
      if (iVar1 == 7) {
        FUN_00024cc8(param_2);
      }
      else if (iVar1 != 8) {
        if (iVar1 == 5) {
          (*param_4)(1,0x1a,param_3,param_3,param_2,param_5);
        }
        return;
      }
    }
  }
  return;
}


