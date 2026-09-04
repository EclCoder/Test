/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001ead4
 * Address  : 0001ead4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint FUN_0001ead4(int *param_1)

{
  uint uVar1;
  
  if ((*(byte *)((int)param_1 + 6) & 3) == 2) {
                    /* WARNING: Could not recover jumptable at 0x0001eaea. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(*param_1 + 4))();
    return uVar1;
  }
  return (uint)((*(byte *)((int)param_1 + 6) & 3) == 0);
}


