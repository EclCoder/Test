/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000268d0
 * Address  : 000268d0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined8 FUN_000268d0(undefined4 param_1,undefined4 param_2)

{
  uint uVar1;
  int iVar2;
  byte bVar3;
  uint in_fpscr;
  double dVar4;
  double dVar5;
  undefined8 uVar6;
  
  if ((double)CONCAT44(param_2,param_1) < 0.0) {
    dVar4 = -(double)CONCAT44(param_2,param_1);
    uVar6 = FUN_00026900(SUB84(dVar4,0),(int)((ulonglong)dVar4 >> 0x20));
    return CONCAT44(-(uint)((int)uVar6 != 0) - (int)((ulonglong)uVar6 >> 0x20),-(int)uVar6);
  }
  dVar4 = (double)CONCAT44(param_2,param_1);
  uVar1 = in_fpscr & 0xfffffff | (uint)(dVar4 == 0.0) << 0x1e | (uint)(0.0 <= dVar4) << 0x1d;
  bVar3 = (byte)(uVar1 >> 0x18);
  if ((bool)(bVar3 >> 5 & 1) && !(bool)(bVar3 >> 6)) {
    iVar2 = (uint)(0.0 < dVar4 * DAT_00026940) * (int)(longlong)(dVar4 * DAT_00026940);
    dVar5 = (double)VectorUnsignedToFloat(iVar2,(byte)(uVar1 >> 0x16) & 3);
    dVar4 = dVar4 + dVar5 * DAT_00026948;
    return CONCAT44(iVar2,(uint)(0.0 < dVar4) * (int)(longlong)dVar4);
  }
  return 0;
}


