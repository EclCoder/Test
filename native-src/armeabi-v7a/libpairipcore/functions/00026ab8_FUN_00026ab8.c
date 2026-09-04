/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00026ab8
 * Address  : 00026ab8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00026ab8(int param_1,undefined4 param_2)

{
  longlong lVar1;
  undefined4 extraout_r2;
  undefined4 extraout_r3;
  
  lVar1 = (ulonglong)*(uint *)(param_1 + 8) * 0x101 +
          CONCAT44(*(int *)(param_1 + 0xc) * 0x101,param_2);
  *(int *)(param_1 + 0x10) = *(int *)(param_1 + 0x10) + 1;
  FUN_00026034((int)lVar1,(int)((ulonglong)lVar1 >> 0x20),0x7fffffff,0);
  *(undefined4 *)(param_1 + 8) = extraout_r2;
  *(undefined4 *)(param_1 + 0xc) = extraout_r3;
  return;
}


