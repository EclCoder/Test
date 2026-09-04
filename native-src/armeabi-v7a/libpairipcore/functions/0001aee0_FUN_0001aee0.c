/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001aee0
 * Address  : 0001aee0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0001aee0(void)

{
  int iVar1;
  int iVar2;
  int iVar3;
  
  iVar1 = DAT_0001af24;
  DataMemoryBarrier(0x1b);
  if (((*(byte *)(DAT_0001af24 + 0x1aef2) & 1) == 0) &&
     (iVar3 = FUN_0001b094(DAT_0001af24 + 0x1aef2), iVar2 = DAT_0001af28, iVar3 != 0)) {
    iVar3 = DAT_0001af28 + 0x1af08;
    FUN_0001af2c(iVar3);
    *(int *)(iVar2 + 0x1af0c) = iVar3;
    FUN_0001b14c(iVar2 + 0x1af10);
  }
  return *(undefined4 *)(iVar1 + 0x1aeee);
}


