/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001bd9c
 * Address  : 0001bd9c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001bd9c(int *param_1,undefined4 param_2)

{
  (**(code **)(*param_1 + 0x10))(param_1);
  if ((*(ushort *)((int)param_1 + 5) & 0xc0) == 0x40) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0001bdc6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x14))(param_1,param_2);
  return;
}


