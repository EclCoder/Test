/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005d694
 * Address  : 0005d694
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005d694(uint param_1,int param_2,uint param_3,int param_4,int *param_5)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  int extraout_r1;
  int extraout_r1_00;
  int iVar4;
  uint uVar5;
  byte *pbVar6;
  int iVar7;
  byte *pbVar8;
  int iVar9;
  uint uVar10;
  bool bVar11;
  
  uVar2 = param_1 << 3;
  uVar10 = param_2 << 3 | param_1 >> 0x1d;
  uVar5 = param_3;
  pbVar8 = (byte *)param_5[4];
  do {
    iVar7 = param_5[3];
    iVar4 = *param_5;
    pbVar6 = (byte *)param_5[5];
    iVar9 = (int)pbVar8 - iVar7;
    FUN_000264a4(iVar9,param_5[1] - iVar4,uVar5);
    bVar1 = *(byte *)(iVar4 + extraout_r1) ^
            ((byte)uVar2 & 0x7f | ((uint)(uVar2 < 0x80) <= -uVar10) << 7);
    if (pbVar8 < pbVar6) {
      pbVar6 = pbVar8 + 1;
      *pbVar8 = bVar1;
    }
    else {
      uVar5 = iVar9 + 1;
      if (iVar9 == -2 || (int)uVar5 < -1) goto LAB_0005d8e4;
      uVar3 = (int)pbVar6 - iVar7;
      if (uVar5 < uVar3 * 2) {
        uVar5 = uVar3 * 2;
      }
      if (0x3ffffffe < uVar3) {
        uVar5 = 0x7fffffff;
      }
      if (uVar5 == 0) {
        iVar4 = 0;
      }
      else {
        iVar4 = FUN_000a0370(uVar5);
      }
      *(byte *)(iVar4 + iVar9) = bVar1;
      __aeabi_memcpy(iVar4,iVar7,iVar9);
      pbVar6 = (byte *)(iVar4 + iVar9) + 1;
      param_5[3] = iVar4;
      param_5[4] = (int)pbVar6;
      param_5[5] = iVar4 + uVar5;
      if (iVar7 != 0) {
        FUN_00023f68(iVar7,uVar3);
      }
    }
    bVar11 = uVar2 < 0x80;
    uVar2 = uVar2 >> 7 | uVar10 << 0x19;
    uVar3 = -uVar10;
    uVar5 = -(uVar10 + !bVar11);
    param_5[4] = (int)pbVar6;
    uVar10 = uVar10 >> 7;
    pbVar8 = pbVar6;
  } while (bVar11 <= uVar3);
  uVar5 = param_4 >> 0x1f ^ param_3 << 1;
  uVar2 = (param_4 << 1 | param_3 >> 0x1f) ^ param_4 >> 0x1f;
  do {
    iVar9 = param_5[3];
    iVar7 = *param_5;
    iVar4 = (int)pbVar6 - iVar9;
    pbVar8 = (byte *)param_5[5];
    FUN_000264a4(iVar4,param_5[1] - iVar7,param_4);
    bVar1 = *(byte *)(iVar7 + extraout_r1_00) ^
            ((byte)uVar5 & 0x7f | ((uint)(uVar5 < 0x80) <= -uVar2) << 7);
    if (pbVar6 < pbVar8) {
      pbVar8 = pbVar6 + 1;
      *pbVar6 = bVar1;
    }
    else {
      uVar10 = iVar4 + 1;
      if (iVar4 == -2 || (int)uVar10 < -1) {
LAB_0005d8e4:
                    /* WARNING: Subroutine does not return */
        FUN_0002d020();
      }
      uVar3 = (int)pbVar8 - iVar9;
      if (uVar10 < uVar3 * 2) {
        uVar10 = uVar3 * 2;
      }
      if (0x3ffffffe < uVar3) {
        uVar10 = 0x7fffffff;
      }
      if (uVar10 == 0) {
        iVar7 = 0;
      }
      else {
        iVar7 = FUN_000a0370(uVar10);
      }
      *(byte *)(iVar7 + iVar4) = bVar1;
      __aeabi_memcpy(iVar7,iVar9,iVar4);
      pbVar8 = (byte *)(iVar7 + iVar4) + 1;
      param_5[3] = iVar7;
      param_5[4] = (int)pbVar8;
      param_5[5] = iVar7 + uVar10;
      if (iVar9 != 0) {
        FUN_00023f68(iVar9,uVar3);
      }
    }
    bVar11 = uVar5 < 0x80;
    uVar5 = uVar5 >> 7 | uVar2 << 0x19;
    uVar10 = -uVar2;
    param_4 = -(uVar2 + !bVar11);
    param_5[4] = (int)pbVar8;
    uVar2 = uVar2 >> 7;
    pbVar6 = pbVar8;
    if (uVar10 < bVar11) {
      return;
    }
  } while( true );
}


