/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001eaae
 * Address  : 0001eaae
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint FUN_0001eaae(undefined4 *param_1)

{
  byte bVar1;
  uint uVar2;
  
  bVar1 = (byte)*(undefined2 *)((int)param_1 + 5);
  if ((char)bVar1 < -0x40) {
                    /* WARNING: Could not recover jumptable at 0x0001eac6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (**(code **)*param_1)();
    return uVar2;
  }
  return (uint)(bVar1 < 0x40);
}


