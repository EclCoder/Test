// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 21-40
// ============================================================

// ============================================================
// Function #21
// Name: FUN_00019fe0
// Address: 00019fe0
// JNI: NO
// ============================================================


uint * FUN_00019fe0(uint *param_1)

{
  if ((*param_1 & 1) != 0) {
    FUN_00023f68(param_1[2],*param_1 & 0xfffffffe);
  }
  return param_1;
}




// ============================================================
// Function #22
// Name: FUN_00019ffc
// Address: 00019ffc
// JNI: NO
// ============================================================


void FUN_00019ffc(int param_1,undefined4 param_2,undefined4 param_3,int param_4,undefined4 param_5,
                 int param_6,int param_7)

{
  FUN_0001a224(param_1);
  *(int *)(param_1 + 4) = (param_4 - param_6) + param_7;
  return;
}




// ============================================================
// Function #23
// Name: FUN_0001a02e
// Address: 0001a02e
// JNI: NO
// ============================================================


void FUN_0001a02e(int *param_1,undefined4 param_2,uint param_3)

{
  undefined1 *puVar1;
  
  if (0xfffffff7 < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_00019fd0();
  }
  if (param_3 < 0xb) {
    puVar1 = (undefined1 *)((int)param_1 + 1);
    *(char *)param_1 = (char)(param_3 << 1);
    if (param_3 == 0) goto LAB_0001a06e;
  }
  else {
    puVar1 = (undefined1 *)FUN_000a0370((param_3 | 7) + 1);
    *param_1 = (param_3 | 7) + 2;
    param_1[1] = param_3;
    param_1[2] = (int)puVar1;
  }
  __aeabi_memmove(puVar1,param_2,param_3);
LAB_0001a06e:
  puVar1[param_3] = 0;
  return;
}




// ============================================================
// Function #24
// Name: FUN_0001a07c
// Address: 0001a07c
// JNI: NO
// ============================================================


void FUN_0001a07c(uint *param_1,uint param_2)

{
  byte *pbVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  byte *pbVar5;
  uint uVar6;
  uint uVar7;
  
  if (0xfffffff7 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_00019fd0();
  }
  uVar2 = (*param_1 & 0xfffffffe) - 1;
  if ((*param_1 & 1) == 0) {
    uVar2 = 10;
  }
  if (param_2 <= uVar2) {
    return;
  }
  uVar2 = 10;
  if (10 < param_2) {
    uVar2 = param_2 | 7;
  }
  uVar3 = *param_1;
  uVar6 = param_1[1];
  if ((uVar3 & 1) == 0) {
    uVar6 = (uVar3 & 0xff) >> 1;
  }
  uVar4 = (uVar3 & 0xfffffffe) - 1;
  uVar7 = uVar4;
  if ((*param_1 & 1) == 0) {
    uVar7 = 10;
  }
  if (uVar2 < 0xb) {
    pbVar5 = (byte *)param_1[2];
    pbVar1 = (byte *)((int)param_1 + 1);
    uVar3 = 1;
  }
  else {
    if (uVar7 < uVar2) {
      pbVar1 = (byte *)FUN_000a0370();
    }
    else {
      pbVar1 = (byte *)FUN_000a0370();
      if ((uVar3 & 1) == 0) {
        uVar4 = 10;
      }
      if (uVar4 < uVar2) {
        FUN_00023f68(pbVar1,uVar2 + 1);
        return;
      }
    }
    pbVar5 = (byte *)param_1[2];
    uVar3 = uVar3 & 1;
    if (uVar3 == 0) {
      pbVar5 = (byte *)((int)param_1 + 1);
    }
  }
  if (uVar6 != 0xffffffff) {
    __aeabi_memmove(pbVar1,pbVar5,uVar6 + 1);
  }
  if (uVar3 != 0) {
    FUN_00023f68(pbVar5,uVar7 + 1);
  }
  if (uVar2 < 0xb) {
    *(byte *)param_1 = (byte)(uVar6 << 1);
  }
  else {
    param_1[2] = (uint)pbVar1;
    *param_1 = uVar2 + 1 | 1;
    param_1[1] = uVar6;
  }
  return;
}




// ============================================================
// Function #25
// Name: FUN_0001a178
// Address: 0001a178
// JNI: NO
// ============================================================


uint * FUN_0001a178(uint *param_1,undefined4 param_2,uint param_3)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  byte *pbVar4;
  
  uVar1 = *param_1;
  uVar3 = param_1[1];
  if (uVar1 * -0x80000000 == 0) {
    uVar3 = (uVar1 & 0xff) >> 1;
  }
  iVar2 = (uVar1 & 0xfffffffe) - 1;
  if ((*param_1 & 1) == 0) {
    iVar2 = 10;
  }
  if (iVar2 - uVar3 < param_3) {
    FUN_00019f04(param_1,iVar2,(param_3 - iVar2) + uVar3,uVar3,uVar3,0,param_3,param_2);
  }
  else if (param_3 != 0) {
    pbVar4 = (byte *)param_1[2];
    if (uVar1 * -0x80000000 == 0) {
      pbVar4 = (byte *)((int)param_1 + 1);
    }
    __aeabi_memmove(pbVar4 + uVar3,param_2,param_3);
    uVar3 = uVar3 + param_3;
    if ((*param_1 & 1) == 0) {
      *(char *)param_1 = (char)uVar3 * '\x02';
    }
    else {
      param_1[1] = uVar3;
    }
    pbVar4[uVar3] = 0;
  }
  return param_1;
}




// ============================================================
// Function #26
// Name: FUN_0001a224
// Address: 0001a224
// JNI: NO
// ============================================================


void FUN_0001a224(uint *param_1,uint param_2,uint param_3,int param_4,int param_5,int param_6,
                 int param_7)

{
  uint uVar1;
  byte *pbVar2;
  uint uVar3;
  undefined1 *puVar4;
  
  puVar4 = &stack0xfffffff8;
  if (param_3 <= -param_2 - 9) {
    pbVar2 = (byte *)param_1[2];
    if ((*param_1 & 1) == 0) {
      pbVar2 = (byte *)((int)param_1 + 1);
    }
    if (DAT_0001a2c8 < param_2) {
      uVar3 = 0xfffffff7;
    }
    else {
      param_3 = param_3 + param_2;
      if (param_3 <= param_2 * 2) {
        param_3 = param_2 << 1;
      }
      uVar3 = (param_3 | 7) + 1;
      if (param_3 < 0xb) {
        uVar3 = 0xb;
      }
    }
    uVar1 = FUN_000a0370(uVar3);
    if (param_5 != 0) {
      __aeabi_memmove(uVar1,pbVar2,param_5);
    }
    if (param_4 != param_6 + param_5) {
      __aeabi_memmove(uVar1 + param_5 + param_7,pbVar2 + param_6 + param_5,
                      param_4 - (param_6 + param_5),param_6,puVar4);
    }
    if (param_2 != 10) {
      FUN_00023f68(pbVar2);
    }
    param_1[2] = uVar1;
    *param_1 = uVar3 | 1;
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_00019fd0();
}




// ============================================================
// Function #27
// Name: FUN_0001a2cc
// Address: 0001a2cc
// JNI: NO
// ============================================================


void FUN_0001a2cc(uint *param_1,byte param_2)

{
  byte bVar1;
  uint uVar2;
  byte *pbVar3;
  uint uVar4;
  
  bVar1 = (byte)*param_1;
  if ((bVar1 & 1) == 0) {
    if (bVar1 != 0x14) {
      pbVar3 = (byte *)((int)param_1 + 1);
      *(byte *)param_1 = bVar1 + 2;
      uVar2 = (uint)(bVar1 >> 1);
      goto LAB_0001a31c;
    }
    uVar4 = 10;
LAB_0001a2f6:
    uVar2 = uVar4;
    FUN_00019ffc(param_1,uVar2,1,uVar2,uVar2,0,0);
  }
  else {
    uVar2 = param_1[1];
    uVar4 = (*param_1 & 0xfffffffe) - 1;
    if (uVar2 == uVar4) goto LAB_0001a2f6;
  }
  param_1[1] = uVar2 + 1;
  pbVar3 = (byte *)param_1[2];
LAB_0001a31c:
  pbVar3[uVar2] = param_2;
  pbVar3[uVar2 + 1] = 0;
  return;
}




// ============================================================
// Function #28
// Name: FUN_0001a3b0
// Address: 0001a3b0
// JNI: NO
// ============================================================


uint FUN_0001a3b0(byte *param_1,uint param_2,uint param_3)

{
  int iVar1;
  uint uVar2;
  byte *pbVar3;
  
  uVar2 = *(uint *)(param_1 + 4);
  pbVar3 = *(byte **)(param_1 + 8);
  if ((*param_1 & 1) == 0) {
    pbVar3 = param_1 + 1;
    uVar2 = (uint)(*param_1 >> 1);
  }
  if (uVar2 == 0) {
LAB_0001a3f2:
    uVar2 = 0xffffffff;
  }
  else {
    if (param_3 < uVar2) {
      uVar2 = param_3 + 1;
    }
    do {
      if (uVar2 == 0) goto LAB_0001a3f2;
      iVar1 = uVar2 - 1;
      uVar2 = uVar2 - 1;
    } while (pbVar3[iVar1] != param_2);
  }
  return uVar2;
}




// ============================================================
// Function #29
// Name: FUN_0001a414
// Address: 0001a414
// JNI: NO
// ============================================================


void FUN_0001a414(undefined4 param_1,char *param_2)

{
  size_t sVar1;
  
  sVar1 = strlen(param_2);
  FUN_0001a178(param_1,param_2,sVar1);
  return;
}




// ============================================================
// Function #30
// Name: FUN_0001a430
// Address: 0001a430
// JNI: NO
// ============================================================


uint * FUN_0001a430(uint *param_1,uint param_2,byte param_3)

{
  byte *pbVar1;
  uint *puVar2;
  int iVar3;
  byte *pbVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  bool bVar8;
  
  uVar6 = param_1[1];
  if (((byte)*param_1 & 1) == 0) {
    uVar6 = (uint)(byte)((byte)*param_1 >> 1);
  }
  if (param_2 <= uVar6) {
    bVar8 = (*param_1 & 1) == 0;
    puVar2 = param_1;
    if (bVar8) {
      puVar2 = (uint *)((int)param_1 + 1);
      *(byte *)param_1 = (byte)(param_2 << 1);
    }
    if (!bVar8) {
      puVar2[1] = param_2;
      puVar2 = (uint *)puVar2[2];
    }
    *(byte *)((int)puVar2 + param_2) = 0;
    return puVar2;
  }
  param_2 = param_2 - uVar6;
  if (param_2 != 0) {
    uVar6 = *param_1;
    uVar7 = param_1[1];
    uVar5 = uVar6 & 1;
    if (uVar5 == 0) {
      uVar7 = (uVar6 & 0xff) >> 1;
    }
    iVar3 = (uVar6 & 0xfffffffe) - 1;
    if ((*param_1 & 1) == 0) {
      iVar3 = 10;
    }
    if (iVar3 - uVar7 < param_2) {
      FUN_00019ffc(param_1,iVar3,(param_2 - iVar3) + uVar7,uVar7,uVar7,0,0);
      uVar5 = (byte)*param_1 & 1;
    }
    pbVar1 = (byte *)param_1[2];
    if (uVar5 == 0) {
      pbVar1 = (byte *)((int)param_1 + 1);
    }
    pbVar4 = pbVar1 + uVar7;
    for (uVar6 = param_2; uVar6 != 0; uVar6 = uVar6 - 1) {
      *pbVar4 = param_3;
      pbVar4 = pbVar4 + 1;
    }
    uVar7 = uVar7 + param_2;
    if ((*param_1 & 1) == 0) {
      *(char *)param_1 = (char)uVar7 * '\x02';
    }
    else {
      param_1[1] = uVar7;
    }
    pbVar1[uVar7] = 0;
  }
  return param_1;
}




// ============================================================
// Function #31
// Name: FUN_0001a454
// Address: 0001a454
// JNI: NO
// ============================================================


void FUN_0001a454(byte *param_1,char *param_2,byte *param_3)

{
  size_t sVar1;
  int iVar2;
  byte *pbVar3;
  uint uVar4;
  byte *pbVar5;
  undefined4 uStack_24;
  
  uStack_24 = &stack0xfffffff8;
  sVar1 = strlen(param_2);
  uVar4 = *(uint *)(param_3 + 4);
  iVar2 = (uint)*param_3 << 0x1f;
  if (iVar2 == 0) {
    uVar4 = (uint)(*param_3 >> 1);
  }
  FUN_0001a4c6(param_1,iVar2,uVar4 + sVar1,(int)&uStack_24 + 3);
  pbVar5 = *(byte **)(param_1 + 8);
  if ((*param_1 & 1) == 0) {
    pbVar5 = param_1 + 1;
  }
  if (sVar1 != 0) {
    __aeabi_memmove(pbVar5,param_2,sVar1);
  }
  if (uVar4 != 0) {
    pbVar3 = *(byte **)(param_3 + 8);
    if ((*param_3 & 1) == 0) {
      pbVar3 = param_3 + 1;
    }
    __aeabi_memmove(pbVar5 + sVar1,pbVar3,uVar4);
  }
  (pbVar5 + sVar1)[uVar4] = 0;
  return;
}




// ============================================================
// Function #32
// Name: FUN_0001a4c6
// Address: 0001a4c6
// JNI: NO
// ============================================================


int * FUN_0001a4c6(int *param_1,undefined4 param_2,uint param_3)

{
  int iVar1;
  
  if (param_3 < 0xfffffff8) {
    if (param_3 < 0xb) {
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
      *(char *)param_1 = (char)(param_3 << 1);
    }
    else {
      iVar1 = FUN_000a0370((param_3 | 7) + 1);
      *param_1 = (param_3 | 7) + 2;
      param_1[1] = param_3;
      param_1[2] = iVar1;
    }
    return param_1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_00019fd0();
}




// ============================================================
// Function #33
// Name: FUN_0001a508
// Address: 0001a508
// JNI: NO
// ============================================================


void FUN_0001a508(undefined4 param_1)

{
  undefined4 uVar1;
  
  uVar1 = FUN_00023fdc(8);
  FUN_0001a5d8(uVar1,param_1);
  FUN_000240ec(uVar1,*(undefined4 *)(DAT_0001a538 + 0x1a522),*(undefined4 *)(DAT_0001a53c + 0x1a528)
              );
  FUN_00024072(uVar1);
                    /* WARNING: Subroutine does not return */
  FUN_00023f96();
}




// ============================================================
// Function #34
// Name: FUN_0001a540
// Address: 0001a540
// JNI: NO
// ============================================================


undefined4 FUN_0001a540(undefined4 param_1,char *param_2)

{
  size_t sVar1;
  
  sVar1 = strlen(param_2);
  FUN_0001a02e(param_1,param_2,sVar1);
  return param_1;
}




// ============================================================
// Function #35
// Name: FUN_0001a55c
// Address: 0001a55c
// JNI: NO
// ============================================================


void FUN_0001a55c(undefined4 param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined4 local_2c [2];
  undefined1 auStack_24 [20];
  
  FUN_0001a8ee(local_2c,auStack_24,&stack0xfffffff0,param_4,param_3,param_4);
  FUN_0001a88c(param_1,auStack_24,local_2c[0]);
  return;
}




// ============================================================
// Function #36
// Name: FUN_0001a584
// Address: 0001a584
// JNI: NO
// ============================================================


undefined4 FUN_0001a584(undefined4 param_1,int param_2,undefined1 *param_3)

{
  undefined4 uVar1;
  
  if (param_2 == 0) {
    return 0;
  }
  uVar1 = (*(code *)PTR_memchr_000a5eb8)(param_1,*param_3,param_2);
  return uVar1;
}




// ============================================================
// Function #37
// Name: FUN_0001a5a8
// Address: 0001a5a8
// JNI: NO
// ============================================================


int FUN_0001a5a8(undefined4 *param_1,void *param_2,uint param_3)

{
  int iVar1;
  uint __n;
  uint uVar2;
  
  uVar2 = param_1[1];
  __n = uVar2;
  if (param_3 < uVar2) {
    __n = param_3;
  }
  iVar1 = memcmp((void *)*param_1,param_2,__n);
  if (iVar1 != 0) {
    return iVar1;
  }
  if (uVar2 == param_3) {
    return 0;
  }
  iVar1 = 1;
  if (uVar2 < param_3) {
    iVar1 = -1;
  }
  return iVar1;
}




// ============================================================
// Function #38
// Name: FUN_0001a5d8
// Address: 0001a5d8
// JNI: NO
// ============================================================


void FUN_0001a5d8(void)

{
  int *piVar1;
  
  piVar1 = (int *)FUN_00019e74();
  *piVar1 = *(int *)(DAT_0001a5ec + 0x1a5e6) + 8;
  return;
}




// ============================================================
// Function #39
// Name: FUN_0001a5f0
// Address: 0001a5f0
// JNI: NO
// ============================================================


byte * FUN_0001a5f0(byte *param_1,uint param_2,int param_3,undefined4 param_4)

{
  int iVar1;
  int iVar2;
  undefined4 extraout_r3;
  undefined4 extraout_r3_00;
  undefined4 unaff_r4;
  byte *pbVar3;
  undefined4 unaff_r5;
  undefined4 unaff_r6;
  undefined4 unaff_r7;
  undefined4 unaff_r11;
  undefined4 unaff_lr;
  
  iVar1 = DAT_0001a884;
  if (DAT_0001a6e4 < param_2) {
    if (DAT_0001a6e8 < param_2) {
      if (param_2 <= DAT_0001a6ec) {
        pbVar3 = (byte *)FUN_0001a81c(param_1,param_2);
        return pbVar3;
      }
      iVar2 = FUN_00026070(param_2,DAT_0001a884);
      param_2 = param_2 - iVar2 * iVar1;
      param_3 = DAT_0001a888 + 0x1a870;
      *(undefined2 *)param_1 = *(undefined2 *)(param_3 + iVar2 * 2);
      param_1 = param_1 + 2;
      param_4 = extraout_r3_00;
    }
    else if (param_2 <= DAT_0001a6f0) {
      pbVar3 = (byte *)FUN_0001a7ac(param_1,param_2);
      return pbVar3;
    }
    iVar1 = DAT_0001a814;
    iVar2 = FUN_00026070(param_2,DAT_0001a814,param_3,param_4,unaff_r11,unaff_r4,unaff_r5,unaff_r6,
                         unaff_r7,unaff_lr);
    param_2 = param_2 - iVar2 * iVar1;
    param_3 = DAT_0001a818 + 0x1a800;
    *(undefined2 *)param_1 = *(undefined2 *)(param_3 + iVar2 * 2);
    param_1 = param_1 + 2;
    param_4 = extraout_r3;
  }
  else {
    if (param_2 < 10000) {
      if (param_2 < 100) {
        if (param_2 < 10) {
          pbVar3 = param_1 + 1;
          *param_1 = (byte)param_2 | 0x30;
        }
        else {
          pbVar3 = param_1 + 2;
          *(undefined2 *)param_1 = *(undefined2 *)(DAT_0001a6fc + 0x1a6c6 + param_2 * 2);
        }
      }
      else {
        if (0x7c < param_2 >> 3) {
          pbVar3 = (byte *)FUN_0001a700(param_1,param_2);
          return pbVar3;
        }
        iVar1 = FUN_00026070(param_2 & 0xffff,100);
        *param_1 = (byte)iVar1 | 0x30;
        *(undefined2 *)(param_1 + 1) =
             *(undefined2 *)(DAT_0001a6f8 + 0x1a684 + (param_2 + iVar1 * -100 & 0xffff) * 2);
        pbVar3 = param_1 + 3;
      }
      return pbVar3;
    }
    if (param_2 <= DAT_0001a6f4) {
      pbVar3 = (byte *)FUN_0001a73c(param_1,param_2);
      return pbVar3;
    }
  }
  iVar1 = FUN_00026070(param_2,10000,param_3,param_4,unaff_r11,unaff_r4,unaff_r5,unaff_r6,unaff_r7,
                       unaff_lr);
  *(undefined2 *)param_1 = *(undefined2 *)(DAT_0001a7a8 + 0x1a794 + iVar1 * 2);
  pbVar3 = (byte *)FUN_0001a700(param_1 + 2,param_2 + iVar1 * -10000);
  return pbVar3;
}




// ============================================================
// Function #40
// Name: FUN_0001a700
// Address: 0001a700
// JNI: NO
// ============================================================


undefined2 * FUN_0001a700(undefined2 *param_1,int param_2)

{
  int iVar1;
  int iVar2;
  
  iVar1 = FUN_00026070(param_2,100);
  iVar2 = DAT_0001a738 + 0x1a71c;
  *param_1 = *(undefined2 *)(iVar2 + iVar1 * 2);
  param_1[1] = *(undefined2 *)(iVar2 + (param_2 + iVar1 * -100) * 2);
  return param_1 + 2;
}




