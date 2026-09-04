/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000264b4
 * Address  : 000264b4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint FUN_000264b4(uint param_1,uint param_2,uint *param_3)

{
  uint uVar1;
  
  if (param_2 == 0) {
    uVar1 = FUN_00026270(0);
    return uVar1;
  }
  if (param_2 != 1) {
    if (param_2 <= param_1) {
                    /* WARNING: Could not recover jumptable at 0x000264e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (*(code *)(&UNK_00026699 + (LZCOUNT(param_2) - LZCOUNT(param_1)) * -0xe))();
      return uVar1;
    }
    *param_3 = param_1;
    return 0;
  }
  *param_3 = 0;
  return param_1;
}


