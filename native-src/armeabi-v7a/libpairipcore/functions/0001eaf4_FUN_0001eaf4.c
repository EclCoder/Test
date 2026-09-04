/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001eaf4
 * Address  : 0001eaf4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint FUN_0001eaf4(int *param_1)

{
  uint uVar1;
  
  uVar1 = (*(ushort *)((int)param_1 + 5) & 0xfff) >> 10;
  if (uVar1 == 2) {
                    /* WARNING: Could not recover jumptable at 0x0001eb0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(*param_1 + 8))();
    return uVar1;
  }
  return (uint)(uVar1 == 0);
}


