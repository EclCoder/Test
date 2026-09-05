// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 581-600
// ============================================================

// ============================================================
// Function #581
// Name: FUN_0005d4e8
// Address: 0005d4e8
// JNI: NO
// ============================================================


void FUN_0005d4e8(int *param_1,undefined4 param_2,uint param_3)

{
  longlong lVar1;
  uint uVar2;
  int *piVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  undefined8 uVar7;
  int local_30;
  int local_2c;
  int local_24;
  
  iVar5 = 0;
  local_24 = **(int **)(DAT_0005d664 + 0x5d508);
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if (param_3 != 0) {
    if ((int)param_3 < 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0002d020();
    }
    iVar5 = FUN_000a0370(param_3);
    param_1[2] = iVar5 + param_3;
    *param_1 = iVar5;
    __aeabi_memclr(iVar5,param_3);
    param_1[1] = iVar5 + param_3;
  }
  uVar2 = FUN_00019718(0x107,0,&local_30);
  if (0xfffff000 < uVar2) {
    piVar3 = (int *)FUN_00025e6c(DAT_0005d668 + 0x5d580);
    *piVar3 = -uVar2;
  }
  lVar1 = (longlong)local_30 * 1000000000 + (longlong)local_2c;
  uVar7 = FUN_00026020((int)lVar1,(int)((ulonglong)lVar1 >> 0x20),1000000,0);
  uVar2 = (uint)uVar7 * 0x10000;
  uVar4 = FUN_00019718(0x14);
  if (0xfffff000 < uVar4) {
    piVar3 = (int *)FUN_00025e6c(DAT_0005d66c + 0x5d5dc);
    *piVar3 = -uVar4;
    uVar4 = 0xffffffff;
  }
  local_30 = uVar2 + uVar4;
  local_2c = ((int)((ulonglong)uVar7 >> 0x20) << 0x10 | (uint)uVar7 >> 0x10) + ((int)uVar4 >> 0x1f)
             + (uint)CARRY4(uVar2,uVar4);
  if (param_3 != 0) {
    uVar4 = 0;
    uVar2 = param_3;
    do {
      uVar6 = uVar2;
      if (7 < uVar2) {
        uVar6 = 8;
      }
      __aeabi_memcpy(iVar5,&local_30,uVar6);
      uVar4 = uVar4 + 8;
      iVar5 = iVar5 + uVar6;
      uVar2 = uVar2 - 8;
    } while (uVar4 < param_3);
  }
  if (**(int **)(DAT_0005d670 + 0x5d64c) != local_24) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #582
// Name: FUN_0005d674
// Address: 0005d674
// JNI: NO
// ============================================================


void FUN_0005d674(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_0005d680 + DAT_0005d680);
}




// ============================================================
// Function #583
// Name: FUN_0005d684
// Address: 0005d684
// JNI: NO
// ============================================================


void FUN_0005d684(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026994((int)&DAT_0005d690 + DAT_0005d690);
}




// ============================================================
// Function #584
// Name: FUN_0005d694
// Address: 0005d694
// JNI: NO
// ============================================================


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




// ============================================================
// Function #585
// Name: FUN_0005d8e8
// Address: 0005d8e8
// JNI: NO
// ============================================================


int FUN_0005d8e8(uint param_1,int param_2,uint param_3,uint param_4,int *param_5)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int extraout_r1;
  int extraout_r1_00;
  byte *pbVar5;
  uint uVar6;
  int iVar7;
  byte *pbVar8;
  int iVar9;
  int iVar10;
  bool bVar11;
  
  uVar2 = param_1 << 3;
  uVar4 = param_2 << 3 | param_1 >> 0x1d;
  uVar6 = param_3;
  pbVar8 = (byte *)param_5[4];
  do {
    iVar7 = param_5[3];
    iVar10 = *param_5;
    iVar9 = (int)pbVar8 - iVar7;
    pbVar5 = (byte *)param_5[5];
    FUN_000264a4(iVar9,param_5[1] - iVar10,uVar6);
    bVar1 = *(byte *)(iVar10 + extraout_r1) ^
            ((byte)uVar2 & 0x7f | ((uint)(uVar2 < 0x80) <= -uVar4) << 7);
    if (pbVar8 < pbVar5) {
      pbVar5 = pbVar8 + 1;
      *pbVar8 = bVar1;
    }
    else {
      uVar6 = iVar9 + 1;
      if (iVar9 == -2 || (int)uVar6 < -1) goto LAB_0005db28;
      uVar3 = (int)pbVar5 - iVar7;
      if (uVar6 < uVar3 * 2) {
        uVar6 = uVar3 * 2;
      }
      if (0x3ffffffe < uVar3) {
        uVar6 = 0x7fffffff;
      }
      if (uVar6 == 0) {
        iVar10 = 0;
      }
      else {
        iVar10 = FUN_000a0370(uVar6);
      }
      *(byte *)(iVar10 + iVar9) = bVar1;
      __aeabi_memcpy(iVar10,iVar7,iVar9);
      pbVar5 = (byte *)(iVar10 + iVar9) + 1;
      param_5[3] = iVar10;
      param_5[4] = (int)pbVar5;
      param_5[5] = iVar10 + uVar6;
      if (iVar7 != 0) {
        FUN_00023f68(iVar7,uVar3);
      }
    }
    bVar11 = uVar2 < 0x80;
    uVar2 = uVar2 >> 7 | uVar4 << 0x19;
    uVar3 = -uVar4;
    uVar6 = -(uVar4 + !bVar11);
    param_5[4] = (int)pbVar5;
    uVar4 = uVar4 >> 7;
    pbVar8 = pbVar5;
  } while (bVar11 <= uVar3);
  do {
    iVar10 = param_5[3];
    iVar9 = *param_5;
    pbVar8 = (byte *)param_5[5];
    iVar7 = (int)pbVar5 - iVar10;
    FUN_000264a4(iVar7,param_5[1] - iVar9);
    bVar1 = *(byte *)(iVar9 + extraout_r1_00) ^
            ((byte)param_3 & 0x7f | ((uint)(param_3 < 0x80) <= -param_4) << 7);
    if (pbVar5 < pbVar8) {
      pbVar8 = pbVar5 + 1;
      *pbVar5 = bVar1;
    }
    else {
      uVar2 = iVar7 + 1;
      if (iVar7 == -2 || (int)uVar2 < -1) {
LAB_0005db28:
                    /* WARNING: Subroutine does not return */
        FUN_0002d020();
      }
      uVar6 = (int)pbVar8 - iVar10;
      if (uVar2 < uVar6 * 2) {
        uVar2 = uVar6 * 2;
      }
      if (0x3ffffffe < uVar6) {
        uVar2 = 0x7fffffff;
      }
      if (uVar2 == 0) {
        iVar9 = 0;
      }
      else {
        iVar9 = FUN_000a0370(uVar2);
      }
      *(byte *)(iVar9 + iVar7) = bVar1;
      __aeabi_memcpy(iVar9,iVar10,iVar7);
      pbVar8 = (byte *)(iVar9 + iVar7) + 1;
      param_5[3] = iVar9;
      param_5[4] = (int)pbVar8;
      param_5[5] = iVar9 + uVar2;
      if (iVar10 != 0) {
        FUN_00023f68(iVar10,uVar6);
      }
    }
    bVar11 = param_3 < 0x80;
    uVar2 = -param_4;
    iVar7 = param_4 + !bVar11;
    param_5[4] = (int)pbVar8;
    param_3 = param_3 >> 7 | param_4 << 0x19;
    param_4 = param_4 >> 7;
    pbVar5 = pbVar8;
    if (uVar2 < bVar11) {
      return -iVar7;
    }
  } while( true );
}




// ============================================================
// Function #586
// Name: FUN_0005db2c
// Address: 0005db2c
// JNI: NO
// ============================================================


void FUN_0005db2c(uint param_1,int param_2,int *param_3,int *param_4)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  int extraout_r1;
  int extraout_r1_00;
  int extraout_r1_01;
  int extraout_r1_02;
  byte *pbVar8;
  byte *pbVar9;
  byte *pbVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  int iVar14;
  bool bVar15;
  uint local_38;
  uint local_34;
  byte *local_30;
  int local_28;
  
  uVar12 = 0;
  local_28 = **(int **)(DAT_0005df68 + 0x5db54);
  local_34 = 0;
  local_38 = 0;
  local_30 = (byte *)0x0;
  FUN_0001a07c(&local_38,param_3[4] - param_3[3]);
  iVar2 = param_3[3];
  iVar7 = param_3[4];
  if (iVar7 != iVar2) {
    do {
      if ((uint)(param_3[4] - param_3[3]) <= uVar12) {
                    /* WARNING: Subroutine does not return */
        FUN_0005d684();
      }
      iVar14 = *param_3;
      bVar1 = *(byte *)(param_3[3] + uVar12);
      FUN_000264a4(uVar12,param_3[1] - iVar14);
      FUN_0001a2cc(&local_38,*(byte *)(iVar14 + extraout_r1) ^ bVar1);
      uVar12 = uVar12 + 1;
    } while (iVar7 - iVar2 != uVar12);
  }
  pbVar8 = local_30;
  uVar12 = local_34;
  uVar13 = local_38;
  uVar3 = local_38 & 0xff;
  uVar4 = param_1 << 3 | 2;
  uVar6 = param_2 << 3 | param_1 >> 0x1d;
  pbVar10 = (byte *)param_4[4];
  do {
    iVar7 = param_4[3];
    iVar2 = *param_4;
    pbVar9 = (byte *)param_4[5];
    iVar14 = (int)pbVar10 - iVar7;
    FUN_000264a4(iVar14,param_4[1] - iVar2);
    bVar1 = *(byte *)(iVar2 + extraout_r1_00) ^
            ((byte)uVar4 & 0x7f | ((uint)(uVar4 < 0x80) <= -uVar6) << 7);
    if (pbVar10 < pbVar9) {
      pbVar9 = pbVar10 + 1;
      *pbVar10 = bVar1;
    }
    else {
      uVar11 = iVar14 + 1;
      if (iVar14 == -2 || (int)uVar11 < -1) goto LAB_0005df60;
      uVar5 = (int)pbVar9 - iVar7;
      if (uVar11 < uVar5 * 2) {
        uVar11 = uVar5 * 2;
      }
      if (0x3ffffffe < uVar5) {
        uVar11 = 0x7fffffff;
      }
      if (uVar11 == 0) {
        iVar2 = 0;
      }
      else {
        iVar2 = FUN_000a0370(uVar11);
      }
      *(byte *)(iVar2 + iVar14) = bVar1;
      __aeabi_memcpy(iVar2,iVar7,iVar14);
      pbVar9 = (byte *)(iVar2 + iVar14) + 1;
      param_4[3] = iVar2;
      param_4[4] = (int)pbVar9;
      param_4[5] = iVar2 + uVar11;
      if (iVar7 != 0) {
        FUN_00023f68(iVar7,uVar5);
      }
    }
    bVar15 = uVar4 < 0x80;
    uVar4 = uVar4 >> 7 | uVar6 << 0x19;
    uVar5 = -uVar6;
    uVar11 = uVar6 + !bVar15;
    param_4[4] = (int)pbVar9;
    uVar6 = uVar6 >> 7;
    pbVar10 = pbVar9;
  } while (bVar15 <= uVar5);
  uVar6 = uVar12;
  if ((uVar13 & 1) == 0) {
    uVar12 = uVar3 >> 1;
    uVar6 = uVar12;
  }
  do {
    iVar14 = param_4[3];
    iVar2 = *param_4;
    pbVar10 = (byte *)param_4[5];
    iVar7 = (int)pbVar9 - iVar14;
    FUN_000264a4(iVar7,param_4[1] - iVar2,-uVar11);
    bVar1 = *(byte *)(iVar2 + extraout_r1_01) ^ ((byte)uVar12 & 0x7f | (0x7f < uVar12) << 7);
    if (pbVar9 < pbVar10) {
      pbVar10 = pbVar9 + 1;
      *pbVar9 = bVar1;
    }
    else {
      uVar3 = iVar7 + 1;
      if (iVar7 == -2 || (int)uVar3 < -1) goto LAB_0005df60;
      uVar4 = (int)pbVar10 - iVar14;
      if (uVar3 < uVar4 * 2) {
        uVar3 = uVar4 * 2;
      }
      if (0x3ffffffe < uVar4) {
        uVar3 = 0x7fffffff;
      }
      if (uVar3 == 0) {
        iVar2 = 0;
      }
      else {
        iVar2 = FUN_000a0370(uVar3);
      }
      *(byte *)(iVar2 + iVar7) = bVar1;
      __aeabi_memcpy(iVar2,iVar14,iVar7);
      pbVar10 = (byte *)(iVar2 + iVar7) + 1;
      param_4[3] = iVar2;
      param_4[4] = (int)pbVar10;
      param_4[5] = iVar2 + uVar3;
      if (iVar14 != 0) {
        FUN_00023f68(iVar14,uVar4);
      }
    }
    bVar15 = 0x7f < uVar12;
    uVar12 = uVar12 >> 7;
    uVar11 = (uint)bVar15;
    param_4[4] = (int)pbVar10;
    pbVar9 = pbVar10;
  } while (bVar15);
  if ((uVar13 & 1) == 0) {
    pbVar8 = (byte *)((uint)&local_38 | 1);
  }
  do {
    if (uVar6 == 0) {
      if ((local_38 & 1) != 0) {
        FUN_00023f68(local_30,local_38 & 0xfffffffe);
      }
      if (**(int **)(DAT_0005df6c + 0x5de70) == local_28) {
        return;
      }
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    iVar14 = param_4[3];
    iVar7 = *param_4;
    iVar2 = (int)pbVar10 - iVar14;
    pbVar9 = (byte *)param_4[5];
    FUN_000264a4(iVar2,param_4[1] - iVar7);
    bVar1 = *(byte *)(iVar7 + extraout_r1_02) ^ *pbVar8;
    if (pbVar10 < pbVar9) {
      pbVar9 = pbVar10 + 1;
      *pbVar10 = bVar1;
    }
    else {
      uVar12 = iVar2 + 1;
      if (iVar2 == -2 || (int)uVar12 < -1) {
LAB_0005df60:
                    /* WARNING: Subroutine does not return */
        FUN_0002d020();
      }
      uVar13 = (int)pbVar9 - iVar14;
      if (uVar12 < uVar13 * 2) {
        uVar12 = uVar13 * 2;
      }
      if (0x3ffffffe < uVar13) {
        uVar12 = 0x7fffffff;
      }
      if (uVar12 == 0) {
        iVar7 = 0;
      }
      else {
        iVar7 = FUN_000a0370(uVar12);
      }
      *(byte *)(iVar7 + iVar2) = bVar1;
      __aeabi_memcpy(iVar7,iVar14,iVar2);
      pbVar9 = (byte *)(iVar7 + iVar2) + 1;
      param_4[3] = iVar7;
      param_4[4] = (int)pbVar9;
      param_4[5] = iVar7 + uVar12;
      if (iVar14 != 0) {
        FUN_00023f68(iVar14,uVar13);
      }
    }
    pbVar8 = pbVar8 + 1;
    param_4[4] = (int)pbVar9;
    uVar6 = uVar6 - 1;
    pbVar10 = pbVar9;
  } while( true );
}




// ============================================================
// Function #587
// Name: FUN_0005df70
// Address: 0005df70
// JNI: NO
// ============================================================


void FUN_0005df70(uint param_1,int param_2,byte *param_3,uint param_4,int *param_5)

{
  byte bVar1;
  uint uVar2;
  int extraout_r1;
  int extraout_r1_00;
  int extraout_r1_01;
  int iVar3;
  byte *pbVar4;
  byte *pbVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  int iVar9;
  int iVar10;
  uint uVar11;
  bool bVar12;
  
  iVar3 = 2;
  uVar2 = param_1 << 3 | 2;
  uVar7 = param_2 << 3 | param_1 >> 0x1d;
  pbVar5 = (byte *)param_5[4];
  do {
    iVar8 = param_5[3];
    iVar10 = *param_5;
    iVar9 = (int)pbVar5 - iVar8;
    pbVar4 = (byte *)param_5[5];
    FUN_000264a4(iVar9,param_5[1] - iVar10,iVar3);
    bVar1 = *(byte *)(iVar10 + extraout_r1) ^
            ((byte)uVar2 & 0x7f | ((uint)(uVar2 < 0x80) <= -uVar7) << 7);
    if (pbVar5 < pbVar4) {
      pbVar4 = pbVar5 + 1;
      *pbVar5 = bVar1;
    }
    else {
      uVar6 = iVar9 + 1;
      if (iVar9 == -2 || (int)uVar6 < -1) goto LAB_0005e290;
      uVar11 = (int)pbVar4 - iVar8;
      if (uVar6 < uVar11 * 2) {
        uVar6 = uVar11 * 2;
      }
      if (0x3ffffffe < uVar11) {
        uVar6 = 0x7fffffff;
      }
      if (uVar6 == 0) {
        iVar3 = 0;
      }
      else {
        iVar3 = FUN_000a0370(uVar6);
      }
      *(byte *)(iVar3 + iVar9) = bVar1;
      __aeabi_memcpy(iVar3,iVar8,iVar9);
      pbVar4 = (byte *)(iVar3 + iVar9) + 1;
      param_5[3] = iVar3;
      param_5[4] = (int)pbVar4;
      param_5[5] = iVar3 + uVar6;
      if (iVar8 != 0) {
        FUN_00023f68(iVar8,uVar11);
      }
    }
    bVar12 = uVar2 < 0x80;
    uVar2 = uVar2 >> 7 | uVar7 << 0x19;
    uVar6 = -uVar7;
    iVar3 = -(uVar7 + !bVar12);
    param_5[4] = (int)pbVar4;
    uVar11 = param_4;
    uVar7 = uVar7 >> 7;
    pbVar5 = pbVar4;
  } while (bVar12 <= uVar6);
  do {
    iVar9 = param_5[3];
    iVar10 = *param_5;
    iVar8 = (int)pbVar4 - iVar9;
    pbVar5 = (byte *)param_5[5];
    FUN_000264a4(iVar8,param_5[1] - iVar10,iVar3);
    bVar1 = *(byte *)(iVar10 + extraout_r1_00) ^ ((byte)uVar11 & 0x7f | (0x7f < uVar11) << 7);
    if (pbVar4 < pbVar5) {
      pbVar5 = pbVar4 + 1;
      *pbVar4 = bVar1;
    }
    else {
      uVar7 = iVar8 + 1;
      if (iVar8 == -2 || (int)uVar7 < -1) goto LAB_0005e290;
      uVar2 = (int)pbVar5 - iVar9;
      if (uVar7 < uVar2 * 2) {
        uVar7 = uVar2 * 2;
      }
      if (0x3ffffffe < uVar2) {
        uVar7 = 0x7fffffff;
      }
      if (uVar7 == 0) {
        iVar3 = 0;
      }
      else {
        iVar3 = FUN_000a0370(uVar7);
      }
      *(byte *)(iVar3 + iVar8) = bVar1;
      __aeabi_memcpy(iVar3,iVar9,iVar8);
      pbVar5 = (byte *)(iVar3 + iVar8) + 1;
      param_5[3] = iVar3;
      param_5[4] = (int)pbVar5;
      param_5[5] = iVar3 + uVar7;
      if (iVar9 != 0) {
        FUN_00023f68(iVar9,uVar2);
      }
    }
    bVar12 = 0x7f < uVar11;
    iVar3 = -(uint)bVar12;
    param_5[4] = (int)pbVar5;
    uVar11 = uVar11 >> 7;
    pbVar4 = pbVar5;
  } while (bVar12);
  do {
    if (param_4 == 0) {
      return;
    }
    iVar9 = param_5[3];
    iVar8 = *param_5;
    iVar3 = (int)pbVar5 - iVar9;
    pbVar4 = (byte *)param_5[5];
    FUN_000264a4(iVar3,param_5[1] - iVar8);
    bVar1 = *(byte *)(iVar8 + extraout_r1_01) ^ *param_3;
    if (pbVar5 < pbVar4) {
      pbVar4 = pbVar5 + 1;
      *pbVar5 = bVar1;
    }
    else {
      uVar7 = iVar3 + 1;
      if (iVar3 == -2 || (int)uVar7 < -1) {
LAB_0005e290:
                    /* WARNING: Subroutine does not return */
        FUN_0002d020();
      }
      uVar2 = (int)pbVar4 - iVar9;
      if (uVar7 < uVar2 * 2) {
        uVar7 = uVar2 * 2;
      }
      if (0x3ffffffe < uVar2) {
        uVar7 = 0x7fffffff;
      }
      if (uVar7 == 0) {
        iVar8 = 0;
      }
      else {
        iVar8 = FUN_000a0370(uVar7);
      }
      *(byte *)(iVar8 + iVar3) = bVar1;
      __aeabi_memcpy(iVar8,iVar9,iVar3);
      pbVar4 = (byte *)(iVar8 + iVar3) + 1;
      param_5[3] = iVar8;
      param_5[4] = (int)pbVar4;
      param_5[5] = iVar8 + uVar7;
      if (iVar9 != 0) {
        FUN_00023f68(iVar9,uVar2);
      }
    }
    param_3 = param_3 + 1;
    param_5[4] = (int)pbVar4;
    param_4 = param_4 - 1;
    pbVar5 = pbVar4;
  } while( true );
}




// ============================================================
// Function #588
// Name: FUN_0005e298
// Address: 0005e298
// JNI: NO
// ============================================================


void FUN_0005e298(void)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  int iVar6;
  undefined4 *puVar7;
  undefined1 *puVar8;
  int *piVar9;
  uint uVar10;
  undefined1 *puVar11;
  undefined4 *puVar12;
  int iVar13;
  undefined1 *puVar14;
  uint uVar15;
  int local_58;
  int local_54;
  int local_50;
  uint local_4c;
  uint local_48;
  undefined1 *local_44;
  uint local_40;
  uint local_3c;
  undefined1 *local_38;
  int local_34;
  int local_30;
  int local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_0005e810 + 0x5e2ac);
  puVar7 = (undefined4 *)FUN_000a0398(0xd);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x2f;
  *(undefined1 *)((int)puVar7 + 1) = 100;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 2) = 0x65;
  *(undefined1 *)((int)puVar7 + 3) = 0x76;
  *(undefined4 *)((int)puVar7 + 5) = 0;
  *(undefined1 *)(puVar7 + 1) = 0x2f;
  *(undefined1 *)((int)puVar7 + 5) = 0x75;
  *(undefined1 *)((int)puVar7 + 6) = 0x72;
  *(undefined4 *)((int)puVar7 + 9) = 0;
  *(undefined1 *)((int)puVar7 + 7) = 0x61;
  *(undefined1 *)(puVar7 + 2) = 0x6e;
  *(undefined1 *)((int)puVar7 + 9) = 100;
  *(undefined1 *)((int)puVar7 + 10) = 0x6f;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x6d;
  *(undefined1 *)(puVar7 + 3) = 0;
  puVar8 = (undefined1 *)FUN_000a0370(0x10);
  uVar1 = *(undefined1 *)((int)puVar7 + 1);
  uVar2 = *(undefined1 *)((int)puVar7 + 2);
  uVar3 = *(undefined1 *)((int)puVar7 + 3);
  uVar4 = *(undefined1 *)(puVar7 + 1);
  *puVar8 = *(undefined1 *)puVar7;
  uVar5 = *(undefined1 *)((int)puVar7 + 5);
  puVar8[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 6);
  puVar8[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 7);
  puVar8[3] = uVar3;
  uVar3 = *(undefined1 *)(puVar7 + 2);
  puVar8[4] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar7 + 9);
  puVar8[5] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 10);
  puVar8[6] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0xb);
  puVar8[10] = uVar5;
  puVar8[7] = uVar2;
  puVar8[8] = uVar3;
  puVar8[9] = uVar4;
  puVar8[0xc] = 0;
  puVar8[0xb] = uVar1;
  FUN_00023f74(puVar7);
  piVar9 = (int *)FUN_00025e6c(DAT_0005e814 + 0x5e3b4);
  do {
    while (uVar10 = FUN_00019718(0x142,0xffffff9c,puVar8,0,0), uVar10 < 0xfffff001) {
      if (uVar10 < 0x80000000) {
        piVar9 = (int *)FUN_000a0370(0xc);
        iVar13 = DAT_0005e820 + 0x5e44c;
        piVar9[2] = DAT_0005e81c + 0x5e448;
        *piVar9 = iVar13;
        piVar9[1] = uVar10;
        goto LAB_0005e450;
      }
      if (*piVar9 != 4) goto LAB_0005e400;
    }
    *piVar9 = -uVar10;
  } while (uVar10 == 0xfffffffc);
LAB_0005e400:
  piVar9 = (int *)FUN_000a0370(4);
  *piVar9 = DAT_0005e818 + 0x5e420;
LAB_0005e450:
  puVar7 = (undefined4 *)FUN_000a0370(4);
  *puVar7 = piVar9;
  FUN_00023f68(puVar8,0x10);
  (**(code **)(*piVar9 + 8))(&local_34,piVar9,0x100);
  iVar6 = local_30;
  iVar13 = local_34;
  uVar10 = local_30 - local_34;
  if (uVar10 < 0xfffffff8) {
    if (uVar10 < 0xb) {
      puVar8 = (undefined1 *)((uint)&local_40 | 1);
      local_40 = CONCAT31(local_40._1_3_,(char)uVar10 * '\x02');
    }
    else {
      puVar8 = (undefined1 *)FUN_000a0370((uVar10 | 7) + 1);
      local_40 = (uVar10 | 7) + 2;
      local_3c = uVar10;
      local_38 = puVar8;
    }
    if (iVar13 != iVar6) {
      __aeabi_memcpy(puVar8,iVar13,uVar10);
      puVar8 = puVar8 + uVar10;
    }
    piVar9 = (int *)*puVar7;
    *puVar8 = 0;
    (**(code **)(*piVar9 + 8))(&local_58,piVar9,0x100);
    iVar13 = local_58;
    uVar10 = local_54 - local_58;
    if (uVar10 < 0xfffffff8) {
      if (uVar10 < 0xb) {
        puVar8 = (undefined1 *)((uint)&local_4c | 1);
        local_4c = CONCAT31(local_4c._1_3_,(char)uVar10 * '\x02');
      }
      else {
        puVar8 = (undefined1 *)FUN_000a0370((uVar10 | 7) + 1);
        local_4c = (uVar10 | 7) + 2;
        local_48 = uVar10;
        local_44 = puVar8;
      }
      if (iVar13 != local_54) {
        __aeabi_memcpy(puVar8,iVar13,uVar10);
        puVar8 = puVar8 + uVar10;
      }
      *puVar8 = 0;
      puVar11 = (undefined1 *)FUN_000a0370(0x48);
      *puVar11 = 0;
      puVar11[1] = 0;
      puVar11[2] = 0;
      puVar11[3] = 0;
      puVar11[4] = 0;
      puVar11[5] = 0;
      puVar11[6] = 0;
      puVar11[7] = 0;
      puVar11[8] = 0;
      puVar11[9] = 0;
      puVar11[10] = 0;
      puVar11[0xb] = 0;
      puVar11[0xc] = 0;
      puVar11[0xd] = 0;
      puVar11[0xe] = 0;
      puVar11[0xf] = 0;
      puVar11[0x10] = 0;
      puVar11[0x11] = 0;
      puVar11[0x12] = 0;
      puVar11[0x13] = 0;
      puVar11[0x14] = 0;
      puVar11[0x15] = 0;
      puVar11[0x16] = 0;
      puVar11[0x17] = 0;
      puVar11[0x18] = 0;
      puVar11[0x19] = 0;
      puVar11[0x1a] = 0;
      puVar11[0x1b] = 0;
      puVar11[0x1c] = 0;
      puVar11[0x1d] = 0;
      puVar11[0x1e] = 0;
      puVar11[0x1f] = 0;
      puVar11[0x20] = 1;
      puVar11[0x21] = 1;
      puVar11[0x22] = 1;
      puVar11[0x23] = 1;
      puVar11[0x24] = 1;
      puVar11[0x25] = 1;
      puVar11[0x26] = 1;
      puVar11[0x27] = 1;
      puVar11[0x28] = 1;
      puVar11[0x29] = 1;
      puVar11[0x2a] = 1;
      puVar11[0x2b] = 1;
      puVar11[0x2c] = 1;
      puVar11[0x2d] = 1;
      puVar11[0x2e] = 1;
      puVar11[0x2f] = 1;
      puVar11[0x30] = 1;
      puVar11[0x31] = 1;
      puVar11[0x32] = 1;
      puVar11[0x33] = 1;
      puVar11[0x34] = 1;
      puVar11[0x35] = 1;
      puVar11[0x36] = 1;
      puVar11[0x37] = 1;
      puVar11[0x38] = 1;
      puVar11[0x39] = 1;
      puVar11[0x3a] = 1;
      puVar11[0x3b] = 1;
      puVar11[0x3c] = 1;
      puVar11[0x3d] = 1;
      puVar11[0x3e] = 1;
      puVar11[0x3f] = 1;
      iVar13 = DAT_0005e824;
      *(undefined4 *)(puVar11 + 0x40) = 1;
      uVar10 = local_48;
      puVar8 = local_44;
      if ((local_4c & 1) == 0) {
        puVar8 = (undefined1 *)((uint)&local_4c | 1);
        uVar10 = local_4c >> 1 & 0x7f;
      }
      uVar15 = local_3c;
      puVar14 = local_38;
      if ((local_40 & 1) == 0) {
        puVar14 = (undefined1 *)((uint)&local_40 | 1);
        uVar15 = local_40 >> 1 & 0x7f;
      }
      *(undefined4 *)(puVar11 + 0x44) = 0;
      FUN_0002da50(puVar11,0,puVar14,uVar15,puVar8,uVar10,iVar13 + 0x5e6ec,0);
      if (uVar15 != 0 || uVar10 != 0) {
        FUN_0002da50(puVar11,1,puVar14,uVar15,puVar8,uVar10,iVar13 + 0x5e6ec,0);
      }
      if ((local_4c & 1) != 0) {
        FUN_00023f68(local_44,local_4c & 0xfffffffe);
      }
      if (local_58 != 0) {
        FUN_00023f68(local_58,local_50 - local_58);
      }
      if ((local_40 & 1) != 0) {
        FUN_00023f68(local_38,local_40 & 0xfffffffe);
      }
      if (local_34 != 0) {
        local_30 = local_34;
        FUN_00023f68(local_34,local_2c - local_34);
      }
      puVar12 = (undefined4 *)FUN_000a0370(0x20);
      iVar13 = DAT_0005e828;
      *puVar12 = puVar11;
      puVar12[1] = puVar7;
      puVar12[2] = iVar13 + 0x5e79c;
      puVar12[6] = puVar12 + 2;
      if (**(int **)(DAT_0005e82c + 0x5e7b0) != local_28) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_00026b08();
}




// ============================================================
// Function #589
// Name: FUN_0005e880
// Address: 0005e880
// JNI: NO
// ============================================================


void FUN_0005e880(undefined4 param_1,int param_2,undefined4 *param_3)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  undefined1 *puVar4;
  int iVar5;
  undefined1 *puVar6;
  uint local_58;
  uint local_54;
  undefined1 *local_50;
  uint local_4c;
  uint local_48;
  undefined1 *local_44;
  int local_40;
  int local_3c;
  int local_38;
  int local_34;
  int local_30;
  int local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_0005eaf4 + 0x5e89c);
  (**(code **)(*(int *)*param_3 + 8))(&local_34,(int *)*param_3,0x100);
  iVar1 = local_30;
  iVar5 = local_34;
  uVar3 = local_30 - local_34;
  if (uVar3 < 0xfffffff8) {
    if (uVar3 < 0xb) {
      local_58 = CONCAT31(local_58._1_3_,(char)uVar3 * '\x02');
      puVar4 = (undefined1 *)((uint)&local_58 | 1);
    }
    else {
      puVar4 = (undefined1 *)FUN_000a0370((uVar3 | 7) + 1);
      local_58 = (uVar3 | 7) + 2;
      local_54 = uVar3;
      local_50 = puVar4;
    }
    if (iVar5 != iVar1) {
      __aeabi_memcpy(puVar4,iVar5,uVar3);
      puVar4 = puVar4 + uVar3;
    }
    puVar6 = local_50;
    uVar3 = local_54;
    uVar2 = local_58;
    *puVar4 = 0;
    (**(code **)(*(int *)*param_3 + 8))(&local_40,(int *)*param_3,0x100);
    iVar1 = local_3c;
    iVar5 = local_40;
    if ((uVar2 & 1) == 0) {
      uVar3 = uVar2 >> 1 & 0x7f;
      puVar6 = (undefined1 *)((uint)&local_58 | 1);
    }
    uVar2 = local_3c - local_40;
    if (uVar2 < 0xfffffff8) {
      if (uVar2 < 0xb) {
        puVar4 = (undefined1 *)((uint)&local_4c | 1);
        local_4c = CONCAT31(local_4c._1_3_,(char)uVar2 * '\x02');
      }
      else {
        puVar4 = (undefined1 *)FUN_000a0370((uVar2 | 7) + 1);
        local_4c = (uVar2 | 7) + 2;
        local_48 = uVar2;
        local_44 = puVar4;
      }
      if (iVar5 != iVar1) {
        __aeabi_memcpy(puVar4,iVar5,uVar2);
        puVar4 = puVar4 + uVar2;
      }
      *puVar4 = 0;
      puVar4 = local_44;
      uVar2 = local_48;
      if ((local_4c & 1) == 0) {
        uVar2 = local_4c >> 1 & 0x7f;
        puVar4 = (undefined1 *)((uint)&local_4c | 1);
      }
      iVar5 = DAT_0005eaf8 + 0x5ea30;
      FUN_0002da50(param_2,0,puVar6,uVar3,puVar4,uVar2,iVar5,0);
      if (uVar3 != 0 || uVar2 != 0) {
        FUN_0002da50(param_2,1,puVar6,uVar3,puVar4,uVar2,iVar5,0);
      }
      *(undefined4 *)(param_2 + 0x40) = 1;
      *(undefined4 *)(param_2 + 0x44) = 0;
      if ((local_4c & 1) != 0) {
        FUN_00023f68(local_44,local_4c & 0xfffffffe);
      }
      if (local_40 != 0) {
        local_3c = local_40;
        FUN_00023f68(local_40,local_38 - local_40);
      }
      if ((local_58 & 1) != 0) {
        FUN_00023f68(local_50,local_58 & 0xfffffffe);
      }
      if (local_34 != 0) {
        local_30 = local_34;
        FUN_00023f68(local_34,local_2c - local_34);
      }
      if (**(int **)(DAT_0005eafc + 0x5eadc) != local_28) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_00026b08();
}




// ============================================================
// Function #590
// Name: FUN_0005eb00
// Address: 0005eb00
// JNI: NO
// ============================================================


byte FUN_0005eb00(int param_1)

{
  byte bVar1;
  int iVar2;
  
  FUN_0001ae24();
  bVar1 = *(byte *)(param_1 + 8);
  iVar2 = *(int *)(param_1 + 4);
  FUN_0001ae3c(param_1);
  return bVar1 & iVar2 < 1;
}




// ============================================================
// Function #591
// Name: FUN_0005eb30
// Address: 0005eb30
// JNI: NO
// ============================================================


void FUN_0005eb30(int param_1)

{
  FUN_0001ae24();
  if ((*(char *)(param_1 + 8) == '\x01') && (0 < *(int *)(param_1 + 4))) {
    *(int *)(param_1 + 4) = *(int *)(param_1 + 4) + -1;
  }
  FUN_0001ae3c(param_1);
  return;
}




// ============================================================
// Function #592
// Name: FUN_0005eb64
// Address: 0005eb64
// JNI: NO
// ============================================================


void FUN_0005eb64(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_0005eb70 + DAT_0005eb70);
}




// ============================================================
// Function #593
// Name: FUN_0005eb74
// Address: 0005eb74
// JNI: NO
// ============================================================


void FUN_0005eb74(int *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  
  puVar1 = (undefined8 *)*param_1;
  uVar3 = *param_2;
  *(undefined4 *)(puVar1 + 1) = *(undefined4 *)(param_2 + 1);
  *puVar1 = uVar3;
  uVar2 = *(undefined4 *)((int)param_2 + 0x14);
  *(undefined4 *)param_2 = 0;
  *(undefined4 *)((int)param_2 + 4) = 0;
  *(undefined4 *)(param_2 + 1) = 0;
  *(undefined4 *)(puVar1 + 2) = *(undefined4 *)(param_2 + 2);
  *(undefined4 *)((int)puVar1 + 0x14) = uVar2;
  uVar3 = param_2[3];
  *(undefined4 *)(puVar1 + 4) = *(undefined4 *)(param_2 + 4);
  puVar1[3] = uVar3;
  *(undefined4 *)(param_2 + 3) = 0;
  *(undefined4 *)((int)param_2 + 0x1c) = 0;
  *(undefined4 *)(param_2 + 4) = 0;
  return;
}




// ============================================================
// Function #594
// Name: FUN_0005ebcc
// Address: 0005ebcc
// JNI: NO
// ============================================================


void FUN_0005ebcc(int *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  
  puVar1 = (undefined8 *)*param_1;
  uVar3 = *param_2;
  *(undefined4 *)(puVar1 + 1) = *(undefined4 *)(param_2 + 1);
  *puVar1 = uVar3;
  uVar2 = *(undefined4 *)((int)param_2 + 0x14);
  *(undefined4 *)param_2 = 0;
  *(undefined4 *)((int)param_2 + 4) = 0;
  *(undefined4 *)(param_2 + 1) = 0;
  *(undefined4 *)(puVar1 + 2) = *(undefined4 *)(param_2 + 2);
  *(undefined4 *)((int)puVar1 + 0x14) = uVar2;
  uVar3 = param_2[3];
  *(undefined4 *)(puVar1 + 4) = *(undefined4 *)(param_2 + 4);
  puVar1[3] = uVar3;
  *(undefined4 *)(param_2 + 3) = 0;
  *(undefined4 *)((int)param_2 + 0x1c) = 0;
  *(undefined4 *)(param_2 + 4) = 0;
  return;
}




// ============================================================
// Function #595
// Name: FUN_0005ec24
// Address: 0005ec24
// JNI: NO
// ============================================================


void FUN_0005ec24(void)

{
  return;
}




// ============================================================
// Function #596
// Name: FUN_0005ec28
// Address: 0005ec28
// JNI: NO
// ============================================================


void FUN_0005ec28(int *param_1,byte *param_2)

{
  undefined4 uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  puVar2 = (undefined8 *)*param_1;
  if ((*param_2 & 1) == 0) {
    uVar3 = *(undefined8 *)param_2;
    *(undefined4 *)(puVar2 + 1) = *(undefined4 *)(param_2 + 8);
    *puVar2 = uVar3;
  }
  else {
    FUN_000289d4(puVar2,*(undefined4 *)(param_2 + 8),*(undefined4 *)(param_2 + 4));
  }
  uVar1 = *(undefined4 *)(param_2 + 0x14);
  *(undefined4 *)(puVar2 + 2) = *(undefined4 *)(param_2 + 0x10);
  *(undefined4 *)((int)puVar2 + 0x14) = uVar1;
  if ((param_2[0x18] & 1) == 0) {
    uVar3 = *(undefined8 *)(param_2 + 0x18);
    *(undefined4 *)(puVar2 + 4) = *(undefined4 *)(param_2 + 0x20);
    puVar2[3] = uVar3;
    return;
  }
  FUN_000289d4(puVar2 + 3,*(undefined4 *)(param_2 + 0x20),*(undefined4 *)(param_2 + 0x1c));
  return;
}




// ============================================================
// Function #597
// Name: FUN_0005eca4
// Address: 0005eca4
// JNI: NO
// ============================================================


void FUN_0005eca4(int *param_1,byte *param_2)

{
  undefined4 uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  puVar2 = (undefined8 *)*param_1;
  if ((*param_2 & 1) == 0) {
    uVar3 = *(undefined8 *)param_2;
    *(undefined4 *)(puVar2 + 1) = *(undefined4 *)(param_2 + 8);
    *puVar2 = uVar3;
  }
  else {
    FUN_000289d4(puVar2,*(undefined4 *)(param_2 + 8),*(undefined4 *)(param_2 + 4));
  }
  uVar1 = *(undefined4 *)(param_2 + 0x14);
  *(undefined4 *)(puVar2 + 2) = *(undefined4 *)(param_2 + 0x10);
  *(undefined4 *)((int)puVar2 + 0x14) = uVar1;
  if ((param_2[0x18] & 1) == 0) {
    uVar3 = *(undefined8 *)(param_2 + 0x18);
    *(undefined4 *)(puVar2 + 4) = *(undefined4 *)(param_2 + 0x20);
    puVar2[3] = uVar3;
    return;
  }
  FUN_000289d4(puVar2 + 3,*(undefined4 *)(param_2 + 0x20),*(undefined4 *)(param_2 + 0x1c));
  return;
}




// ============================================================
// Function #598
// Name: FUN_0005ed20
// Address: 0005ed20
// JNI: NO
// ============================================================


void FUN_0005ed20(int *param_1,int param_2)

{
  uint uVar1;
  undefined4 *puVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  __start_routine *__start_routine;
  uint uVar6;
  undefined4 uVar7;
  undefined1 *puVar8;
  int iVar9;
  undefined4 *puVar10;
  int *piVar11;
  undefined4 *puVar12;
  int iVar13;
  int iVar14;
  undefined1 uStack_89;
  undefined1 local_88 [40];
  int local_60;
  undefined1 *local_58;
  char local_54;
  int local_30;
  int local_28;
  
  local_28 = **(int **)(DAT_0005f1e8 + 0x5ed40);
  FUN_0001ae24(param_1 + 1);
  iVar3 = DAT_0005f1ec;
  puVar10 = (undefined4 *)*param_1;
  if (puVar10 != (undefined4 *)0x0) goto LAB_0005f0cc;
  DataMemoryBarrier(0xb);
  if ((*(byte *)(DAT_0005f1ec + 0x5ed98) & 1) == 0) {
    iVar9 = DAT_0005f1ec + 0x5ed98;
    iVar4 = FUN_0001b094(iVar9);
    if (iVar4 != 0) {
      piVar11 = (int *)FUN_000a0370(0x20);
      iVar4 = DAT_0005f1f4;
      iVar13 = DAT_0005f1f0 + 0x5f1ac;
      piVar11[3] = DAT_0005f1f8 + 0x5f1b0;
      *(undefined1 *)(piVar11 + 1) = 1;
      piVar11[2] = iVar13;
      piVar11[6] = (int)(piVar11 + 2);
      *piVar11 = iVar4 + 0x5f1b0;
      *(int **)(iVar3 + 0x5ed9c) = piVar11;
      FUN_0001b14c(iVar9);
    }
  }
  uVar7 = *(undefined4 *)(iVar3 + 0x5ed9c);
  puVar10 = (undefined4 *)FUN_000a0370(0x34);
  puVar10[10] = 0;
  *puVar10 = 0;
  puVar10[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar10[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar10[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar10[4] = 0;
  puVar10[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar10[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar10[7] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar10[8] = uVar7;
  *(undefined4 *)((int)puVar10 + 0x2d) = 0;
  *(undefined4 *)((int)puVar10 + 0x29) = 0;
  piVar11 = puVar10 + 9;
  *piVar11 = 0;
  uVar7 = FUN_000a0370(4);
  FUN_0001afe8();
  puVar2 = (undefined4 *)FUN_000a0370(8);
  __start_routine = (__start_routine *)(DAT_0005f1fc + 0x5ede0);
  *puVar2 = uVar7;
  puVar2[1] = puVar10;
  iVar3 = pthread_create((pthread_t *)&local_58,(pthread_attr_t *)0x0,__start_routine,puVar2);
  if (iVar3 != 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0001ac4c(iVar3,DAT_0005f214 + 0x5f1e4);
  }
  if (*piVar11 != 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b280();
  }
  puVar10[9] = local_58;
  local_58 = (undefined1 *)0x0;
  FUN_0001ae60(&local_58);
  FUN_0001aea8(piVar11);
  iVar3 = *param_1;
  *param_1 = (int)puVar10;
  if (iVar3 == 0) goto LAB_0005f0cc;
  DataMemoryBarrier(0xb);
  if ((*(byte *)(iVar3 + 0x30) & 1) == 0) {
    local_30 = 2;
    FUN_0005f218(iVar3,&local_58);
    if (local_30 != -1) {
      (**(code **)(DAT_0005f200 + 0x5ee68 + local_30 * 4))(&uStack_89,&local_58);
    }
  }
  puVar8 = (undefined1 *)(iVar3 + 0x2c);
  local_54 = '\x01';
  local_58 = puVar8;
  FUN_0001ae24(puVar8);
  DataMemoryBarrier(0xb);
  if ((*(byte *)(iVar3 + 0x30) & 1) == 0) {
    do {
      FUN_0001ade0(iVar3 + 0x28,&local_58);
      DataMemoryBarrier(0xb);
    } while ((*(byte *)(iVar3 + 0x30) & 1) == 0);
  }
  if (local_54 == '\x01') {
    FUN_0001ae3c(local_58);
  }
  piVar11 = (int *)(iVar3 + 0x24);
  if (*piVar11 != 0) {
    FUN_0001ae70(piVar11);
  }
  FUN_0001ae24(puVar8);
  FUN_0001ae3c(puVar8);
  FUN_0001ae10(puVar8);
  FUN_0001adb0(iVar3 + 0x28);
  FUN_0001ae60(piVar11);
  puVar2 = *(undefined4 **)(iVar3 + 0xc);
  puVar10 = puVar2;
  if (*(undefined4 **)(iVar3 + 0x10) != puVar2) {
    uVar6 = *(uint *)(iVar3 + 0x18);
    uVar5 = *(int *)(iVar3 + 0x1c) + uVar6;
    piVar11 = puVar2 + uVar6 / 0x55;
    iVar4 = *piVar11;
    uVar1 = uVar5 / 0x55;
    iVar9 = iVar4 + (uVar6 / 0x55) * -0xff0 + uVar6 * 0x30;
    iVar13 = puVar2[uVar1] + uVar1 * -0xff0 + uVar5 * 0x30;
    puVar10 = *(undefined4 **)(iVar3 + 0x10);
    if (iVar9 != iVar13) {
      iVar14 = DAT_0005f204 + 0x5efa0;
      do {
        if (*(int *)(iVar9 + 0x28) != -1) {
          (**(code **)(iVar14 + *(int *)(iVar9 + 0x28) * 4))(&local_58,iVar9);
          iVar4 = *piVar11;
        }
        *(undefined4 *)(iVar9 + 0x28) = 0xffffffff;
        iVar9 = iVar9 + 0x30;
        if (iVar9 - iVar4 == 0xff0) {
          piVar11 = piVar11 + 1;
          iVar9 = *piVar11;
          iVar4 = iVar9;
        }
      } while (iVar9 != iVar13);
      puVar2 = *(undefined4 **)(iVar3 + 0xc);
      puVar10 = *(undefined4 **)(iVar3 + 0x10);
    }
  }
  *(undefined4 *)(iVar3 + 0x1c) = 0;
  iVar4 = (int)puVar10 - (int)puVar2;
  while (uVar1 = iVar4 >> 2, 2 < uVar1) {
    FUN_00023f68(*puVar2,0xff0);
    puVar10 = *(undefined4 **)(iVar3 + 0x10);
    puVar2 = (undefined4 *)(*(int *)(iVar3 + 0xc) + 4);
    *(undefined4 **)(iVar3 + 0xc) = puVar2;
    iVar4 = (int)puVar10 - (int)puVar2;
  }
  if (uVar1 == 1) {
    uVar7 = 0x2a;
LAB_0005f05c:
    *(undefined4 *)(iVar3 + 0x18) = uVar7;
  }
  else if (uVar1 == 2) {
    uVar7 = 0x55;
    goto LAB_0005f05c;
  }
  if (puVar2 != puVar10) {
    do {
      puVar12 = puVar2 + 1;
      FUN_00023f68(*puVar2,0xff0);
      puVar2 = puVar12;
    } while (puVar12 != puVar10);
    iVar4 = *(int *)(iVar3 + 0x10);
    if (*(int *)(iVar3 + 0xc) != iVar4) {
      *(uint *)(iVar3 + 0x10) = iVar4 + ((*(int *)(iVar3 + 0xc) - iVar4) + 3U & 0xfffffffc);
    }
  }
  iVar4 = *(int *)(iVar3 + 8);
  if (iVar4 != 0) {
    FUN_00023f68(iVar4,*(int *)(iVar3 + 0x14) - iVar4);
  }
  FUN_0001ae10(iVar3 + 4);
  uVar7 = FUN_0001adb0(iVar3);
  FUN_00023f68(uVar7,0x34);
  puVar10 = (undefined4 *)*param_1;
LAB_0005f0cc:
  iVar3 = *(int *)(param_2 + 0x28);
  local_60 = -1;
  local_88[0] = 0;
  if (iVar3 != -1) {
    local_58 = local_88;
    (**(code **)(DAT_0005f208 + 0x5f100 + iVar3 * 4))(&local_58,param_2);
    local_60 = iVar3;
  }
  FUN_0005f218(puVar10,local_88);
  if (local_60 != -1) {
    (**(code **)(DAT_0005f20c + 0x5f130 + local_60 * 4))(&local_58,local_88);
  }
  local_60 = 0xffffffff;
  FUN_0001ae3c(param_1 + 1);
  if (**(int **)(DAT_0005f210 + 0x5f15c) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #599
// Name: FUN_0005f218
// Address: 0005f218
// JNI: NO
// ============================================================


void FUN_0005f218(int param_1,int param_2)

{
  uint uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  int iVar4;
  undefined4 uVar5;
  uint uVar6;
  int iVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined1 *puVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  uint uVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  uint uVar16;
  int iVar17;
  bool bVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 *local_38;
  undefined1 *local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_0005f768 + 0x5f238);
  FUN_0001ae24(param_1 + 4);
  puVar14 = *(undefined8 **)(param_1 + 0xc);
  puVar15 = *(undefined8 **)(param_1 + 0x10);
  uVar1 = *(uint *)(param_1 + 0x18);
  uVar13 = (int)puVar15 - (int)puVar14;
  iVar7 = 0;
  if (puVar15 != puVar14) {
    iVar7 = ((int)uVar13 >> 2) * 0x55 + -1;
  }
  if (iVar7 == *(int *)(param_1 + 0x1c) + uVar1) {
    if (uVar1 < 0x55) {
      puVar9 = *(undefined8 **)(param_1 + 8);
      puVar11 = *(undefined8 **)(param_1 + 0x14);
      if (uVar13 < (uint)((int)puVar11 - (int)puVar9)) {
        uVar5 = FUN_000a0370(0xff0);
        if (puVar11 == puVar15) {
          if (puVar14 == puVar9) {
            iVar7 = (int)puVar11 - (int)puVar14;
            uVar1 = iVar7 >> 1;
            if (puVar15 == puVar14) {
              uVar1 = 1;
            }
            if (0x3fffffff < uVar1) goto LAB_0005f764;
            iVar4 = FUN_000a0370(uVar1 << 2);
            iVar17 = iVar4 + uVar1 * 4;
            puVar12 = (undefined8 *)(iVar4 + (uVar1 + 3 & 0xfffffffc));
            puVar11 = puVar12;
            if (puVar15 == puVar14) {
LAB_0005f71c:
              bVar18 = puVar14 == (undefined8 *)0x0;
              *(int *)(param_1 + 8) = iVar4;
              *(undefined8 **)(param_1 + 0xc) = puVar12;
              *(undefined8 **)(param_1 + 0x10) = puVar11;
              *(int *)(param_1 + 0x14) = iVar17;
              puVar14 = puVar12;
              if (bVar18) goto LAB_0005f748;
            }
            else {
              puVar11 = (undefined8 *)((int)puVar12 + uVar13);
              puVar15 = puVar12;
              puVar2 = puVar14;
              if ((uVar13 - 4 < 0x1c) || (((uVar1 + 3 & 0x7ffffffc) + iVar4) - (int)puVar14 < 0x10))
              {
LAB_0005f70c:
                do {
                  puVar8 = (undefined8 *)((int)puVar15 + 4);
                  *(undefined4 *)puVar15 = *(undefined4 *)puVar2;
                  puVar15 = puVar8;
                  puVar2 = (undefined8 *)((int)puVar2 + 4);
                } while (puVar8 != puVar11);
                goto LAB_0005f71c;
              }
              uVar16 = (uVar13 - 4 >> 2) + 1;
              uVar13 = uVar16 & 0xfffffffc;
              uVar1 = uVar13;
              do {
                uVar19 = *puVar2;
                uVar20 = puVar2[1];
                puVar2 = puVar2 + 2;
                uVar1 = uVar1 - 4;
                *puVar15 = uVar19;
                puVar15[1] = uVar20;
                puVar15 = puVar15 + 2;
              } while (uVar1 != 0);
              if (uVar16 != uVar13) {
                puVar15 = (undefined8 *)((int)puVar12 + uVar13 * 4);
                puVar2 = (undefined8 *)((int)puVar14 + uVar13 * 4);
                goto LAB_0005f70c;
              }
              *(int *)(param_1 + 8) = iVar4;
              *(undefined8 **)(param_1 + 0xc) = puVar12;
              *(undefined8 **)(param_1 + 0x10) = puVar11;
              *(int *)(param_1 + 0x14) = iVar17;
            }
            FUN_00023f68(puVar9,iVar7);
            puVar14 = *(undefined8 **)(param_1 + 0xc);
          }
LAB_0005f748:
          *(undefined4 *)((int)puVar14 + -4) = uVar5;
          iVar7 = *(int *)(param_1 + 0xc);
          *(int *)(param_1 + 0xc) = iVar7 + -4;
          uVar5 = *(undefined4 *)(iVar7 + -4);
          *(int *)(param_1 + 0xc) = iVar7;
          goto LAB_0005f294;
        }
        *(undefined4 *)puVar15 = uVar5;
        *(int *)(param_1 + 0x10) = *(int *)(param_1 + 0x10) + 4;
      }
      else {
        uVar1 = (int)puVar11 - (int)puVar9 >> 1;
        if (puVar11 == puVar9) {
          uVar1 = 1;
        }
        if (0x3fffffff < uVar1) {
LAB_0005f764:
                    /* WARNING: Subroutine does not return */
          FUN_00026984();
        }
        puVar12 = (undefined8 *)FUN_000a0370(uVar1 << 2);
        local_38 = (undefined8 *)((int)puVar12 + uVar1 * 4);
        puVar9 = (undefined8 *)((int)puVar12 + uVar13);
        uVar5 = FUN_000a0370(0xff0);
        puVar11 = puVar12;
        if (uVar13 == uVar1 * 4) {
          if (puVar12 < puVar9) {
            iVar7 = ((int)uVar13 >> 2) + 1;
            puVar9 = (undefined8 *)((int)puVar9 - ((iVar7 - (iVar7 >> 0x1f)) * 2 & 0xfffffffdU));
          }
          else {
            uVar1 = (int)uVar13 >> 1;
            if (puVar15 == puVar14) {
              uVar1 = 1;
            }
            if (0x3fffffff < uVar1) goto LAB_0005f764;
            puVar11 = (undefined8 *)FUN_000a0370(uVar1 << 2);
            FUN_00023f68(puVar12,uVar13);
            local_38 = (undefined8 *)((int)puVar11 + uVar1 * 4);
            puVar14 = *(undefined8 **)(param_1 + 0xc);
            puVar15 = *(undefined8 **)(param_1 + 0x10);
            puVar9 = (undefined8 *)((int)puVar11 + (uVar1 & 0xfffffffc));
          }
        }
        puVar12 = (undefined8 *)((int)puVar9 + 4);
        *(undefined4 *)puVar9 = uVar5;
        puVar2 = puVar12;
        if (puVar15 != puVar14) {
          do {
            puVar14 = puVar9;
            puVar12 = puVar2;
            if (puVar9 == puVar11) {
              if (puVar2 < local_38) {
                iVar7 = ((int)local_38 - (int)puVar2 >> 2) + 1;
                puVar12 = (undefined8 *)
                          ((int)puVar2 + ((iVar7 - (iVar7 >> 0x1f)) * 2 & 0xfffffffdU));
                puVar14 = (undefined8 *)((int)puVar12 - ((int)puVar2 - (int)puVar9));
                if ((int)puVar2 - (int)puVar9 != 0) {
                  __aeabi_memmove4(puVar14,puVar9);
                }
              }
              else {
                iVar7 = (int)local_38 - (int)puVar9;
                uVar1 = iVar7 >> 1;
                if (iVar7 == 0) {
                  uVar1 = 1;
                }
                if (0x3fffffff < uVar1) goto LAB_0005f764;
                puVar8 = (undefined8 *)FUN_000a0370(uVar1 << 2);
                puVar14 = (undefined8 *)((int)puVar8 + (uVar1 + 3 & 0xfffffffc));
                puVar12 = puVar14;
                if (puVar2 != puVar9) {
                  puVar12 = (undefined8 *)((int)puVar14 + ((int)puVar2 - (int)puVar9));
                  uVar13 = ((int)puVar2 - (int)puVar9) - 4;
                  puVar2 = puVar14;
                  if ((0xb < uVar13) &&
                     (0xf < (int)puVar8 + ((uVar1 + 3 & 0x7ffffffc) - (int)puVar9))) {
                    uVar16 = (uVar13 >> 2) + 1;
                    uVar6 = uVar16 & 0xfffffffc;
                    uVar13 = uVar6;
                    puVar2 = puVar9;
                    puVar3 = puVar14;
                    do {
                      uVar19 = *puVar2;
                      uVar20 = puVar2[1];
                      puVar2 = puVar2 + 2;
                      uVar13 = uVar13 - 4;
                      *puVar3 = uVar19;
                      puVar3[1] = uVar20;
                      puVar3 = puVar3 + 2;
                    } while (uVar13 != 0);
                    if (uVar16 == uVar6) goto LAB_0005f4c4;
                    puVar9 = (undefined8 *)((int)puVar9 + uVar6 * 4);
                    puVar2 = (undefined8 *)((int)puVar14 + uVar6 * 4);
                  }
                  do {
                    puVar3 = (undefined8 *)((int)puVar2 + 4);
                    *(undefined4 *)puVar2 = *(undefined4 *)puVar9;
                    puVar2 = puVar3;
                    puVar9 = (undefined8 *)((int)puVar9 + 4);
                  } while (puVar3 != puVar12);
                }
LAB_0005f4c4:
                local_38 = (undefined8 *)((int)puVar8 + uVar1 * 4);
                FUN_00023f68(puVar11,iVar7);
                puVar11 = puVar8;
              }
            }
            puVar15 = (undefined8 *)((int)puVar15 + -4);
            puVar9 = (undefined8 *)((int)puVar14 - 4);
            *(undefined4 *)puVar9 = *(undefined4 *)puVar15;
            puVar2 = puVar12;
          } while (puVar15 != *(undefined8 **)(param_1 + 0xc));
        }
        iVar7 = *(int *)(param_1 + 8);
        iVar4 = *(int *)(param_1 + 0x14);
        *(undefined8 **)(param_1 + 0x14) = local_38;
        *(undefined8 **)(param_1 + 8) = puVar11;
        *(undefined8 **)(param_1 + 0xc) = puVar9;
        *(undefined8 **)(param_1 + 0x10) = puVar12;
        if (iVar7 != 0) {
          FUN_00023f68(iVar7,iVar4 - iVar7);
        }
      }
    }
    else {
      uVar5 = *(undefined4 *)puVar14;
      *(uint *)(param_1 + 0x18) = uVar1 - 0x55;
      *(undefined4 **)(param_1 + 0xc) = (undefined4 *)((int)puVar14 + 4);
LAB_0005f294:
      FUN_0005f774(param_1 + 8,uVar5);
    }
    puVar14 = *(undefined8 **)(param_1 + 0xc);
    puVar10 = (undefined1 *)0x0;
    if (*(undefined8 **)(param_1 + 0x10) == puVar14) goto LAB_0005f2e0;
  }
  else {
    puVar10 = (undefined1 *)0x0;
    if (puVar15 == puVar14) goto LAB_0005f2e0;
  }
  uVar13 = *(int *)(param_1 + 0x1c) + *(int *)(param_1 + 0x18);
  uVar1 = uVar13 / 0x55;
  puVar10 = (undefined1 *)(*(int *)((int)puVar14 + uVar1 * 4) + uVar1 * -0xff0 + uVar13 * 0x30);
LAB_0005f2e0:
  *puVar10 = 0;
  *(undefined4 *)(puVar10 + 0x28) = 0xffffffff;
  iVar7 = *(int *)(param_2 + 0x28);
  if (iVar7 != -1) {
    local_2c = puVar10;
    (**(code **)(DAT_0005f76c + 0x5f30c + iVar7 * 4))(&local_2c,param_2);
    *(int *)(puVar10 + 0x28) = iVar7;
  }
  *(int *)(param_1 + 0x1c) = *(int *)(param_1 + 0x1c) + 1;
  FUN_0001ae3c(param_1 + 4);
  FUN_0001adc2(param_1);
  if (**(int **)(DAT_0005f770 + 0x5f344) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #600
// Name: FUN_0005f774
// Address: 0005f774
// JNI: NO
// ============================================================


void FUN_0005f774(int *param_1,undefined4 param_2)

{
  undefined8 *puVar1;
  uint uVar2;
  uint uVar3;
  undefined8 *puVar4;
  int iVar5;
  uint uVar6;
  undefined4 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  int iVar11;
  undefined8 *puVar12;
  uint uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  puVar10 = (undefined8 *)param_1[2];
  if (puVar10 != (undefined8 *)param_1[3]) goto LAB_0005f8dc;
  puVar8 = (undefined8 *)*param_1;
  puVar9 = (undefined8 *)param_1[1];
  if (puVar8 < puVar9) {
    iVar5 = (int)puVar10 - (int)puVar9;
    iVar11 = (((int)puVar9 - (int)puVar8 >> 2) + 1) / 2;
    puVar7 = (undefined4 *)((int)puVar9 + iVar11 * -4);
    if (iVar5 != 0) {
      __aeabi_memmove4(puVar7,puVar9,iVar5);
      puVar9 = (undefined8 *)param_1[1];
    }
    puVar10 = (undefined8 *)((int)puVar7 + iVar5);
    param_1[1] = (int)((int)puVar9 + iVar11 * -4);
    param_1[2] = (int)puVar10;
    goto LAB_0005f8dc;
  }
  iVar11 = (int)puVar10 - (int)puVar8;
  uVar6 = iVar11 >> 1;
  if (iVar11 == 0) {
    uVar6 = 1;
  }
  if (0x3fffffff < uVar6) {
                    /* WARNING: Subroutine does not return */
    FUN_00026984();
  }
  iVar5 = FUN_000a0370(uVar6 << 2);
  puVar12 = (undefined8 *)(iVar5 + (uVar6 & 0xfffffffc));
  puVar1 = puVar12;
  if (puVar10 != puVar9) {
    puVar1 = (undefined8 *)((int)puVar12 + ((int)puVar10 - (int)puVar9));
    uVar2 = ((int)puVar10 - (int)puVar9) - 4;
    puVar10 = puVar12;
    if ((0x1b < uVar2) && (0xf < ((uVar6 & 0x3ffffffc) + iVar5) - (int)puVar9)) {
      uVar3 = (uVar2 >> 2) + 1;
      uVar13 = uVar3 & 0xfffffffc;
      uVar2 = uVar13;
      puVar4 = puVar9;
      do {
        uVar14 = *puVar4;
        uVar15 = puVar4[1];
        puVar4 = puVar4 + 2;
        uVar2 = uVar2 - 4;
        *puVar10 = uVar14;
        puVar10[1] = uVar15;
        puVar10 = puVar10 + 2;
      } while (uVar2 != 0);
      if (uVar3 == uVar13) goto LAB_0005f8b8;
      puVar9 = (undefined8 *)((int)puVar9 + uVar13 * 4);
      puVar10 = (undefined8 *)((int)puVar12 + uVar13 * 4);
    }
    do {
      puVar4 = (undefined8 *)((int)puVar10 + 4);
      *(undefined4 *)puVar10 = *(undefined4 *)puVar9;
      puVar10 = puVar4;
      puVar9 = (undefined8 *)((int)puVar9 + 4);
    } while (puVar4 != puVar1);
  }
LAB_0005f8b8:
  puVar10 = puVar1;
  *param_1 = iVar5;
  param_1[1] = (int)puVar12;
  param_1[2] = (int)puVar10;
  param_1[3] = iVar5 + uVar6 * 4;
  if (puVar8 != (undefined8 *)0x0) {
    FUN_00023f68(puVar8,iVar11);
    puVar10 = (undefined8 *)param_1[2];
  }
LAB_0005f8dc:
  *(undefined4 *)puVar10 = param_2;
  param_1[2] = param_1[2] + 4;
  return;
}




