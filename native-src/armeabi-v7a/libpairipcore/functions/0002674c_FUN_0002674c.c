/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002674c
 * Address  : 0002674c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined8 FUN_0002674c(float param_1)

{
  uint uVar1;
  int iVar2;
  byte bVar3;
  uint in_fpscr;
  double dVar4;
  undefined8 uVar5;
  
  if (param_1 < 0.0) {
    uVar5 = FUN_00026778(-param_1);
    return CONCAT44(-(uint)((int)uVar5 != 0) - (int)((ulonglong)uVar5 >> 0x20),-(int)uVar5);
  }
  uVar1 = in_fpscr & 0xfffffff | (uint)(param_1 == 0.0) << 0x1e | (uint)(0.0 <= param_1) << 0x1d;
  bVar3 = (byte)(uVar1 >> 0x18);
  if ((bool)(bVar3 >> 5 & 1) && !(bool)(bVar3 >> 6)) {
    dVar4 = (double)param_1 * DAT_000267b8;
    iVar2 = (uint)(0.0 < dVar4) * (int)(longlong)dVar4;
    dVar4 = (double)VectorUnsignedToFloat(iVar2,(byte)(uVar1 >> 0x16) & 3);
    dVar4 = (double)param_1 + dVar4 * DAT_000267c0;
    return CONCAT44(iVar2,(uint)(0.0 < dVar4) * (int)(longlong)dVar4);
  }
  return 0;
}


