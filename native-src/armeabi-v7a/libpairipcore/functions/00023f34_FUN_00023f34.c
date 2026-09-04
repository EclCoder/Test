/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023f34
 * Address  : 00023f34
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023f34(void)

{
  undefined4 uVar1;
  undefined4 extraout_r1;
  int unaff_r6;
  
  FUN_00023fdc(4);
  uVar1 = FUN_0001b440();
  FUN_000240ec(uVar1,*(undefined4 *)(iRam00023f54 + 0x23f4a),*(undefined4 *)(iRam00023f58 + 0x23f4c)
              );
  (*(code *)PTR_free_000a5f80)(extraout_r1,extraout_r1,unaff_r6 + -4);
  return;
}


