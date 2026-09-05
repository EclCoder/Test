// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 501-520
// ============================================================

// ============================================================
// Function #501
// Name: FUN_00026270
// Address: 00026270
// JNI: NO
// ============================================================


void FUN_00026270(void)

{
  return;
}




// ============================================================
// Function #502
// Name: FUN_00026272
// Address: 00026272
// JNI: NO
// ============================================================


undefined8 FUN_00026272(uint param_1,uint param_2,uint param_3,uint param_4,int *param_5)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  uint local_18;
  uint uStack_14;
  
  uVar1 = (int)param_2 >> 0x1f;
  uVar2 = (int)param_4 >> 0x1f;
  local_18 = param_3;
  uStack_14 = param_4;
  uVar3 = FUN_000262cc((param_1 ^ uVar1) - uVar1,
                       ((param_2 ^ uVar1) - uVar1) - (uint)((param_1 ^ uVar1) < uVar1),
                       (param_3 ^ uVar2) - uVar2,
                       ((param_4 ^ uVar2) - uVar2) - (uint)((param_3 ^ uVar2) < uVar2),&local_18,
                       param_2);
  *param_5 = (local_18 ^ uVar1) - uVar1;
  param_5[1] = ((uStack_14 ^ uVar1) - uVar1) - (uint)((local_18 ^ uVar1) < uVar1);
  uVar2 = (int)(param_4 ^ param_2) >> 0x1f;
  uVar1 = (uint)uVar3 ^ uVar2;
  return CONCAT44((((uint)((ulonglong)uVar3 >> 0x20) ^ uVar2) - uVar2) - (uint)(uVar1 < uVar2),
                  uVar1 - uVar2);
}




// ============================================================
// Function #503
// Name: FUN_000262cc
// Address: 000262cc
// JNI: NO
// ============================================================


undefined8 FUN_000262cc(uint param_1,uint param_2,uint param_3,uint param_4,uint *param_5)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  
  if (param_2 == 0) {
    if (param_4 == 0) {
      uVar11 = FUN_00026070(param_1,param_3,param_3,0,0);
      if (param_5 != (uint *)0x0) {
        *param_5 = param_1 - uVar11 * param_3;
        param_5[1] = 0;
      }
    }
    else {
LAB_0002630a:
      if (param_5 != (uint *)0x0) {
        *param_5 = param_1;
        param_5[1] = param_2;
      }
      uVar11 = 0;
    }
  }
  else {
    uVar11 = param_2;
    if (param_3 != 0) {
      if (param_4 == 0) {
        if ((param_3 & param_3 - 1) == 0) {
          if (param_5 != (uint *)0x0) {
            *param_5 = param_3 - 1 & param_1;
            param_5[1] = 0;
          }
          if (param_3 != 1) {
            bVar2 = (byte)param_3;
            bVar3 = (byte)(param_3 >> 8);
            bVar4 = (byte)(param_3 >> 0x10);
            bVar1 = (byte)(param_3 >> 0x18);
            uVar11 = LZCOUNT((uint)(byte)((((((((bVar2 & 1) << 1 | bVar2 >> 1 & 1) << 1 |
                                              bVar2 >> 2 & 1) << 1 | bVar2 >> 3 & 1) << 1 |
                                            bVar2 >> 4 & 1) << 1 | bVar2 >> 5 & 1) << 1 |
                                          bVar2 >> 6 & 1) << 1 | bVar2 >> 7) << 0x18 |
                             (uint)(byte)((((((((bVar3 & 1) << 1 | bVar3 >> 1 & 1) << 1 |
                                              bVar3 >> 2 & 1) << 1 | bVar3 >> 3 & 1) << 1 |
                                            bVar3 >> 4 & 1) << 1 | bVar3 >> 5 & 1) << 1 |
                                          bVar3 >> 6 & 1) << 1 | bVar3 >> 7) << 0x10 |
                             (uint)(byte)((((((((bVar4 & 1) << 1 | bVar4 >> 1 & 1) << 1 |
                                              bVar4 >> 2 & 1) << 1 | bVar4 >> 3 & 1) << 1 |
                                            bVar4 >> 4 & 1) << 1 | bVar4 >> 5 & 1) << 1 |
                                          bVar4 >> 6 & 1) << 1 | bVar4 >> 7) << 8 |
                             (uint)(byte)((((((((bVar1 & 1) << 1 | bVar1 >> 1 & 1) << 1 |
                                              bVar1 >> 2 & 1) << 1 | bVar1 >> 3 & 1) << 1 |
                                            bVar1 >> 4 & 1) << 1 | bVar1 >> 5 & 1) << 1 |
                                          bVar1 >> 6 & 1) << 1 | bVar1 >> 7));
            param_1 = param_1 >> (uVar11 & 0x1f) | (param_2 << 1) << (~uVar11 & 0x1f);
            uVar11 = param_2 >> uVar11;
          }
          goto LAB_00026460;
        }
        uVar11 = (LZCOUNT(param_3) - LZCOUNT(param_2)) + 0x21;
        if (uVar11 == 0x20) goto LAB_0002636e;
        if (uVar11 < 0x20) {
          uVar5 = 0x20 - uVar11;
          goto LAB_000263fc;
        }
        uVar6 = (LZCOUNT(param_3) - LZCOUNT(param_2)) + 1;
        uVar10 = param_2 << (0x40 - uVar11 & 0xff) | param_1 >> (uVar6 & 0xff);
        uVar5 = param_1 << (0x40 - uVar11 & 0xff);
        param_2 = param_2 >> (uVar6 & 0xff);
        uVar6 = 0;
      }
      else {
        uVar5 = LZCOUNT(param_4) - LZCOUNT(param_2);
        if (0x1f < uVar5) goto LAB_0002630a;
        uVar11 = uVar5 + 1;
        if (uVar11 == 0x20) {
LAB_0002636e:
          uVar11 = 0x20;
          uVar5 = 0;
          uVar6 = 0;
          uVar10 = param_1;
        }
        else {
LAB_00026346:
          uVar5 = 0x1f - uVar5;
LAB_000263fc:
          uVar6 = param_2 >> (uVar11 & 0xff);
          param_2 = param_2 << (uVar5 & 0xff) | param_1 >> (uVar11 & 0xff);
          uVar10 = param_1 << (uVar5 & 0xff);
          uVar5 = 0;
        }
      }
      uVar7 = 0;
      while (param_1 = uVar7 | uVar5 << 1, uVar11 != 0) {
        uVar8 = uVar6 << 1 | param_2 >> 0x1f;
        uVar9 = param_2 << 1 | uVar10 >> 0x1f;
        uVar11 = uVar11 - 1;
        uVar7 = param_4 + ~uVar8 + (uint)CARRY4(~uVar9,param_3);
        param_2 = uVar9 - param_3;
        uVar6 = (uVar8 - param_4) - (uint)(uVar9 < param_3);
        if (-1 < (int)uVar7) {
          param_2 = uVar9;
          uVar6 = uVar8;
        }
        uVar7 = uVar7 >> 0x1f;
        uVar10 = uVar10 << 1 | uVar5 >> 0x1f;
        uVar5 = param_1;
      }
      uVar11 = uVar5 >> 0x1f | uVar10 << 1;
      if (param_5 != (uint *)0x0) {
        *param_5 = param_2;
        param_5[1] = uVar6;
      }
      goto LAB_00026460;
    }
    if (param_4 == 0) goto LAB_00026460;
    if (param_1 == 0) {
      uVar11 = FUN_00026070(param_2,param_4,0,param_4,param_4);
      if (param_5 != (uint *)0x0) {
        *param_5 = 0;
        param_5[1] = param_2 - uVar11 * param_4;
      }
    }
    else {
      if ((param_4 & param_4 - 1) != 0) {
        uVar5 = LZCOUNT(param_4) - LZCOUNT(param_2);
        if (uVar5 < 0x1f) {
          uVar11 = uVar5 + 1;
          goto LAB_00026346;
        }
        goto LAB_0002630a;
      }
      if (param_5 != (uint *)0x0) {
        *param_5 = param_1;
        param_5[1] = param_4 - 1 & param_2;
      }
      bVar2 = (byte)param_4;
      bVar3 = (byte)(param_4 >> 8);
      bVar4 = (byte)(param_4 >> 0x10);
      bVar1 = (byte)(param_4 >> 0x18);
      uVar11 = param_2 >>
               LZCOUNT((uint)(byte)((((((((bVar2 & 1) << 1 | bVar2 >> 1 & 1) << 1 | bVar2 >> 2 & 1)
                                        << 1 | bVar2 >> 3 & 1) << 1 | bVar2 >> 4 & 1) << 1 |
                                     bVar2 >> 5 & 1) << 1 | bVar2 >> 6 & 1) << 1 | bVar2 >> 7) <<
                       0x18 | (uint)(byte)((((((((bVar3 & 1) << 1 | bVar3 >> 1 & 1) << 1 |
                                               bVar3 >> 2 & 1) << 1 | bVar3 >> 3 & 1) << 1 |
                                             bVar3 >> 4 & 1) << 1 | bVar3 >> 5 & 1) << 1 |
                                           bVar3 >> 6 & 1) << 1 | bVar3 >> 7) << 0x10 |
                       (uint)(byte)((((((((bVar4 & 1) << 1 | bVar4 >> 1 & 1) << 1 | bVar4 >> 2 & 1)
                                        << 1 | bVar4 >> 3 & 1) << 1 | bVar4 >> 4 & 1) << 1 |
                                     bVar4 >> 5 & 1) << 1 | bVar4 >> 6 & 1) << 1 | bVar4 >> 7) << 8
                       | (uint)(byte)((((((((bVar1 & 1) << 1 | bVar1 >> 1 & 1) << 1 | bVar1 >> 2 & 1
                                          ) << 1 | bVar1 >> 3 & 1) << 1 | bVar1 >> 4 & 1) << 1 |
                                       bVar1 >> 5 & 1) << 1 | bVar1 >> 6 & 1) << 1 | bVar1 >> 7));
    }
  }
  param_1 = uVar11;
  uVar11 = 0;
LAB_00026460:
  return CONCAT44(uVar11,param_1);
}




// ============================================================
// Function #504
// Name: FUN_000264a4
// Address: 000264a4
// JNI: NO
// ============================================================


void FUN_000264a4(undefined4 param_1,undefined4 param_2)

{
  undefined1 local_8 [4];
  
  FUN_000264b4(param_1,param_2,local_8);
  return;
}




// ============================================================
// Function #505
// Name: FUN_000264b4
// Address: 000264b4
// JNI: NO
// ============================================================


uint FUN_000264b4(uint param_1,uint param_2,uint *param_3)

{
  uint uVar1;
  
  if (param_2 == 0) {
    uVar1 = FUN_00026270(0);
    return uVar1;
  }
  if (param_2 != 1) {
    if (param_2 <= param_1) {
                    /* WARNING: Could not recover jumptable at 0x000264e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (*(code *)(&UNK_00026699 + (LZCOUNT(param_2) - LZCOUNT(param_1)) * -0xe))();
      return uVar1;
    }
    *param_3 = param_1;
    return 0;
  }
  *param_3 = 0;
  return param_1;
}




// ============================================================
// Function #506
// Name: FUN_000266c4
// Address: 000266c4
// JNI: NO
// ============================================================


void FUN_000266c4(undefined4 param_1,undefined4 param_2)

{
  undefined1 local_8 [4];
  
  FUN_000266d8(param_1,param_2,local_8);
  return;
}




// ============================================================
// Function #507
// Name: FUN_000266d8
// Address: 000266d8
// JNI: NO
// ============================================================


int FUN_000266d8(uint param_1,uint param_2,uint *param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  
  uVar1 = (int)param_1 >> 0x1f;
  uVar3 = FUN_000264b4((param_1 ^ uVar1) - uVar1,
                       (param_2 ^ (int)param_2 >> 0x1f) - ((int)param_2 >> 0x1f));
  uVar2 = (int)(param_1 ^ param_2) >> 0x1f;
  *param_3 = (*param_3 ^ uVar1) - uVar1;
  return (uVar3 ^ uVar2) - uVar2;
}




// ============================================================
// Function #508
// Name: FUN_00026710
// Address: 00026710
// JNI: NO
// ============================================================


double FUN_00026710(undefined4 param_1,undefined4 param_2)

{
  uint in_fpscr;
  double dVar1;
  
  dVar1 = (double)VectorSignedToFloat(param_2,(byte)(in_fpscr >> 0x16) & 3);
  return DAT_00026740 + dVar1 * DAT_00026738 + (double)CONCAT44(DAT_00026748,param_1);
}




// ============================================================
// Function #509
// Name: FUN_0002674c
// Address: 0002674c
// JNI: NO
// ============================================================


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




// ============================================================
// Function #510
// Name: FUN_00026778
// Address: 00026778
// JNI: NO
// ============================================================


undefined8 FUN_00026778(float param_1)

{
  uint uVar1;
  int iVar2;
  byte bVar3;
  uint in_fpscr;
  double dVar4;
  
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




// ============================================================
// Function #511
// Name: FUN_000267c8
// Address: 000267c8
// JNI: NO
// ============================================================


int FUN_000267c8(uint param_1,uint param_2)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  longlong lVar5;
  
  if (param_1 == 0 && param_2 == 0) {
    return DAT_00026888;
  }
  uVar1 = (int)param_2 >> 0x1f;
  uVar2 = (param_1 ^ uVar1) - uVar1;
  iVar3 = ((param_2 ^ uVar1) - uVar1) - (uint)((param_1 ^ uVar1) < uVar1);
  uVar4 = LZCOUNT(uVar2) + 0x20;
  if (iVar3 != 0) {
    uVar4 = LZCOUNT(iVar3);
  }
  if (uVar4 < 0x28) {
    if (uVar4 != 0x26) {
      if (uVar4 == 0x27) {
        uVar2 = uVar2 * 2;
      }
      else {
        lVar5 = FUN_0002688c(uVar2,iVar3,uVar4 + 0x1a);
        uVar2 = FUN_000268ae(uVar2,iVar3,0x26 - uVar4);
        uVar2 = uVar2 | lVar5 != 0;
      }
    }
    uVar2 = ((uVar2 & 7) >> 2 | uVar2) + 1;
    if ((int)(uVar2 * 0x20) < 0) {
      uVar2 = uVar2 >> 3;
      iVar3 = 0x40;
      goto LAB_00026866;
    }
    uVar2 = uVar2 >> 2;
  }
  else {
    uVar2 = FUN_0002688c(uVar2,param_2,uVar4 - 0x28);
  }
  iVar3 = 0x3f;
LAB_00026866:
  return ((uVar2 & 0x7fffff) + (uVar1 & 0x80000000) | (iVar3 - uVar4) * 0x800000) + 0x3f800000;
}




// ============================================================
// Function #512
// Name: FUN_0002688c
// Address: 0002688c
// JNI: NO
// ============================================================


longlong FUN_0002688c(uint param_1,uint param_2,uint param_3)

{
  uint uVar1;
  
  if (-1 < (int)(param_3 << 0x1a)) {
    if (param_3 != 0) {
      uVar1 = param_1 >> (0x20 - param_3 & 0xff);
      param_1 = param_1 << (param_3 & 0xff);
      param_2 = param_2 << (param_3 & 0xff) | uVar1;
    }
    return CONCAT44(param_2,param_1);
  }
  return (ulonglong)(param_1 << (param_3 - 0x20 & 0xff)) << 0x20;
}




// ============================================================
// Function #513
// Name: FUN_000268ae
// Address: 000268ae
// JNI: NO
// ============================================================


ulonglong FUN_000268ae(uint param_1,uint param_2,uint param_3)

{
  uint uVar1;
  
  if (-1 < (int)(param_3 << 0x1a)) {
    if (param_3 != 0) {
      uVar1 = param_2 << (0x20 - param_3 & 0xff);
      param_2 = param_2 >> (param_3 & 0xff);
      param_1 = param_1 >> (param_3 & 0xff) | uVar1;
    }
    return CONCAT44(param_2,param_1);
  }
  return (ulonglong)(param_2 >> (param_3 - 0x20 & 0xff));
}




// ============================================================
// Function #514
// Name: FUN_000268d0
// Address: 000268d0
// JNI: NO
// ============================================================


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




// ============================================================
// Function #515
// Name: FUN_00026900
// Address: 00026900
// JNI: NO
// ============================================================


undefined8 FUN_00026900(undefined4 param_1,undefined4 param_2)

{
  uint uVar1;
  int iVar2;
  byte bVar3;
  uint in_fpscr;
  double dVar4;
  double dVar5;
  
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




// ============================================================
// Function #516
// Name: FUN_00026950
// Address: 00026950
// JNI: NO
// ============================================================


void FUN_00026950(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_0002695c + DAT_0002695c);
}




// ============================================================
// Function #517
// Name: FUN_00026960
// Address: 00026960
// JNI: NO
// ============================================================


void FUN_00026960(undefined4 param_1)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001ad48((int)&DAT_00026970 + DAT_00026970,param_1);
}




// ============================================================
// Function #518
// Name: FUN_00026974
// Address: 00026974
// JNI: NO
// ============================================================


void FUN_00026974(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_00026980 + DAT_00026980);
}




// ============================================================
// Function #519
// Name: FUN_00026984
// Address: 00026984
// JNI: NO
// ============================================================


void FUN_00026984(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001ad48((int)&DAT_00026990 + DAT_00026990);
}




// ============================================================
// Function #520
// Name: FUN_00026994
// Address: 00026994
// JNI: NO
// ============================================================


void FUN_00026994(undefined4 param_1)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001ad48((int)&DAT_000269a4 + DAT_000269a4,param_1);
}




