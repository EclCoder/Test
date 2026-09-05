// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 1-20
// ============================================================

// ============================================================
// Function #1
// Name: _FINI_1
// Address: 00019680
// JNI: NO
// ============================================================


void _FINI_1(void)

{
  (*(code *)PTR___cxa_finalize_000a5e94)(DAT_00019698 + 0x19694);
  return;
}




// ============================================================
// Function #2
// Name: _FINI_0
// Address: 000196a8
// JNI: NO
// ============================================================


void _FINI_0(void)

{
  (*(code *)0x25f85)();
  return;
}




// ============================================================
// Function #3
// Name: FUN_000196d0
// Address: 000196d0
// JNI: NO
// ============================================================


void FUN_000196d0(undefined4 param_1)

{
  (*(code *)PTR___cxa_atexit_000a5e98)(DAT_000196f4 + 0x196ec,param_1,DAT_000196f8 + 0x196f0);
  return;
}




// ============================================================
// Function #4
// Name: FUN_00019718
// Address: 00019718
// JNI: NO
// ============================================================


undefined8 FUN_00019718(undefined4 param_1,undefined4 param_2,undefined4 param_3)

{
  software_interrupt(0);
  return CONCAT44(param_3,param_2);
}




// ============================================================
// Function #5
// Name: FUN_00019740
// Address: 00019740
// JNI: NO
// ============================================================


void FUN_00019740(void)

{
  FUN_00024006();
                    /* WARNING: Subroutine does not return */
  FUN_0001b280();
}




// ============================================================
// Function #6
// Name: FUN_0001974c
// Address: 0001974c
// JNI: NO
// ============================================================


undefined8 FUN_0001974c(uint param_1)

{
  int iVar1;
  int *piVar2;
  int iVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  int unaff_r5;
  uint uVar8;
  uint uVar9;
  int iVar10;
  bool bVar11;
  uint local_28;
  
  iVar1 = DAT_00019774 + 0x19760;
  local_28 = param_1;
  if (param_1 < 0xd4) {
    piVar2 = (int *)FUN_00019d2a(iVar1,DAT_00019774 + 0x19820,&local_28);
    iVar7 = *piVar2;
LAB_0001976c:
    return CONCAT44(unaff_r5,iVar7);
  }
  FUN_00019d38(param_1);
  iVar3 = FUN_00026070(param_1,0xd2);
  unaff_r5 = DAT_000197b0 + 0x1979a;
  iVar7 = FUN_00019d2a(unaff_r5,DAT_000197b0 + 0x1985a,&stack0xffffffd4);
  iVar10 = iVar7 - unaff_r5 >> 2;
  do {
    iVar7 = *(int *)(unaff_r5 + iVar10 * 4) + iVar3 * 0xd2;
    uVar9 = 5;
    do {
      uVar5 = uVar9;
      if (uVar5 == 0x2f) goto LAB_000197e0;
      uVar8 = *(uint *)(iVar1 + uVar5 * 4);
      uVar4 = FUN_00026070(iVar7,uVar8);
      if (uVar4 < uVar8) goto LAB_0001976c;
      uVar9 = uVar5 + 1;
    } while (iVar7 != uVar8 * uVar4);
    if (0x2e < uVar5) {
LAB_000197e0:
      uVar9 = 0x1a3;
      do {
        uVar4 = uVar9 - 0xd0;
        uVar5 = FUN_00026070(iVar7,uVar4);
        if (uVar5 < uVar4) goto LAB_0001976c;
        if (iVar7 == uVar4 * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xc6);
        if (uVar5 < uVar9 - 0xc6) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xc6) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xc4);
        if (uVar5 < uVar9 - 0xc4) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xc4) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xc0);
        if (uVar5 < uVar9 - 0xc0) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xc0) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xbe);
        if (uVar5 < uVar9 - 0xbe) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xbe) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xba);
        if (uVar5 < uVar9 - 0xba) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xba) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xb4);
        if (uVar5 < uVar9 - 0xb4) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xb4) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xb2);
        if (uVar5 < uVar9 - 0xb2) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xb2) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xac);
        if (uVar5 < uVar9 - 0xac) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xac) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xa8);
        if (uVar5 < uVar9 - 0xa8) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xa8) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xa6);
        if (uVar5 < uVar9 - 0xa6) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xa6) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xa2);
        if (uVar5 < uVar9 - 0xa2) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xa2) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x9c);
        if (uVar5 < uVar9 - 0x9c) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x9c) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x96);
        if (uVar5 < uVar9 - 0x96) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x96) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x94);
        if (uVar5 < uVar9 - 0x94) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x94) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x8e);
        if (uVar5 < uVar9 - 0x8e) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x8e) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x8a);
        if (uVar5 < uVar9 - 0x8a) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x8a) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x88);
        if (uVar5 < uVar9 - 0x88) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x88) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x82);
        if (uVar5 < uVar9 - 0x82) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x82) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x7e);
        if (uVar5 < uVar9 - 0x7e) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x7e) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x78);
        if (uVar5 < uVar9 - 0x78) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x78) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x70);
        if (uVar5 < uVar9 - 0x70) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x70) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x6c);
        if (uVar5 < uVar9 - 0x6c) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x6c) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x6a);
        if (uVar5 < uVar9 - 0x6a) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x6a) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x66);
        if (uVar5 < uVar9 - 0x66) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x66) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 100);
        if (uVar5 < uVar9 - 100) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 100) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x60);
        if (uVar5 < uVar9 - 0x60) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x60) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x58);
        if (uVar5 < uVar9 - 0x58) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x58) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x52);
        if (uVar5 < uVar9 - 0x52) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x52) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x4e);
        if (uVar5 < uVar9 - 0x4e) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x4e) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x48);
        if (uVar5 < uVar9 - 0x48) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x48) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x46);
        if (uVar5 < uVar9 - 0x46) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x46) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x42);
        if (uVar5 < uVar9 - 0x42) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x42) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x3c);
        if (uVar5 < uVar9 - 0x3c) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x3c) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x3a);
        if (uVar5 < uVar9 - 0x3a) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x3a) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x34);
        if (uVar5 < uVar9 - 0x34) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x34) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x2e);
        if (uVar5 < uVar9 - 0x2e) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x2e) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x2a);
        if (uVar5 < uVar9 - 0x2a) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x2a) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x28);
        if (uVar5 < uVar9 - 0x28) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x28) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x24);
        if (uVar5 < uVar9 - 0x24) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x24) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x1e);
        if (uVar5 < uVar9 - 0x1e) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x1e) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x1c);
        if (uVar5 < uVar9 - 0x1c) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x1c) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x16);
        if (uVar5 < uVar9 - 0x16) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x16) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x12);
        if (uVar5 < uVar9 - 0x12) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x12) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x10);
        if (uVar5 < uVar9 - 0x10) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x10) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xc);
        if (uVar5 < uVar9 - 0xc) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xc) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 10);
        if (uVar5 < uVar9 - 10) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 10) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9);
        if (uVar5 < uVar9) goto LAB_0001976c;
        iVar6 = uVar5 * uVar9;
        uVar9 = uVar9 + 0xd2;
      } while (iVar7 != iVar6);
    }
    iVar7 = iVar10 + 1;
    bVar11 = iVar10 != 0x2f;
    iVar10 = 0;
    if (bVar11) {
      iVar10 = iVar7;
    }
    if (iVar7 == 0x30) {
      iVar3 = iVar3 + 1;
    }
  } while( true );
}




// ============================================================
// Function #7
// Name: FUN_00019d2a
// Address: 00019d2a
// JNI: NO
// ============================================================


void FUN_00019d2a(void)

{
  FUN_00019d6a();
  return;
}




// ============================================================
// Function #8
// Name: FUN_00019d38
// Address: 00019d38
// JNI: NO
// ============================================================


/* WARNING: Control flow encountered bad instruction data */

void FUN_00019d38(uint param_1)

{
  undefined4 extraout_r1;
  undefined4 extraout_r2;
  undefined4 unaff_r5;
  undefined4 *unaff_r6;
  
  if (param_1 < 0xfffffffc) {
    return;
  }
  FUN_00019da8(iRam00019d4c + 0x19d4a);
  *unaff_r6 = extraout_r1;
  unaff_r6[1] = extraout_r2;
  unaff_r6[2] = unaff_r5;
  unaff_r6[3] = unaff_r6;
  unaff_r6[4] = &stack0xfffffff8;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}




// ============================================================
// Function #9
// Name: FUN_00019d6a
// Address: 00019d6a
// JNI: NO
// ============================================================


void FUN_00019d6a(uint *param_1,int param_2,uint *param_3)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  
  uVar1 = param_2 - (int)param_1 >> 2;
  while (uVar2 = uVar1, uVar2 != 0) {
    bVar3 = param_1[uVar2 >> 1] < *param_3;
    if (bVar3) {
      param_1 = param_1 + (uVar2 >> 1) + 1;
    }
    uVar1 = uVar2 >> 1;
    if (bVar3) {
      uVar1 = uVar2 + ~(uVar2 >> 1);
    }
  }
  return;
}




// ============================================================
// Function #10
// Name: FUN_00019da8
// Address: 00019da8
// JNI: NO
// ============================================================


void FUN_00019da8(undefined4 param_1)

{
  undefined4 uVar1;
  
  uVar1 = FUN_00023fdc(8);
  FUN_00019de0(uVar1,param_1);
  FUN_000240ec(uVar1,*(undefined4 *)(DAT_00019dd8 + 0x19dc2),*(undefined4 *)(DAT_00019ddc + 0x19dc8)
              );
  FUN_00024072(uVar1);
                    /* WARNING: Subroutine does not return */
  FUN_00023f96();
}




// ============================================================
// Function #11
// Name: FUN_00019de0
// Address: 00019de0
// JNI: NO
// ============================================================


void FUN_00019de0(void)

{
  int *piVar1;
  
  piVar1 = (int *)FUN_00019ed8();
  *piVar1 = *(int *)(DAT_00019df4 + 0x19dee) + 8;
  return;
}




// ============================================================
// Function #12
// Name: FUN_00019df8
// Address: 00019df8
// JNI: NO
// ============================================================


void FUN_00019df8(void)

{
  return;
}




// ============================================================
// Function #13
// Name: FUN_00019dfe
// Address: 00019dfe
// JNI: NO
// ============================================================


void FUN_00019dfe(int *param_1)

{
  bool bVar1;
  int *piVar2;
  int iVar3;
  
  DataMemoryBarrier(0x1b);
  if (param_1[2] != 0) {
    piVar2 = param_1 + 2;
    DataMemoryBarrier(0x1b);
    do {
      ExclusiveAccess(piVar2);
      iVar3 = *piVar2;
      bVar1 = (bool)hasExclusiveAccess(piVar2);
    } while (!bVar1);
    *piVar2 = iVar3 + -1;
    DataMemoryBarrier(0x1b);
    if (iVar3 != 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00019e30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x10))();
  return;
}




// ============================================================
// Function #14
// Name: FUN_00019e32
// Address: 00019e32
// JNI: NO
// ============================================================


undefined4 FUN_00019e32(void)

{
  return 0;
}




// ============================================================
// Function #15
// Name: FUN_00019e3a
// Address: 00019e3a
// JNI: NO
// ============================================================


undefined4 * FUN_00019e3a(undefined4 *param_1,char *param_2)

{
  size_t sVar1;
  size_t *psVar2;
  
  sVar1 = strlen(param_2);
  psVar2 = (size_t *)FUN_000a0370(sVar1 + 0xd);
  *psVar2 = sVar1;
  psVar2[1] = sVar1;
  psVar2[2] = 0;
  __aeabi_memcpy(psVar2 + 3,param_2,sVar1 + 1);
  *param_1 = psVar2 + 3;
  return param_1;
}




// ============================================================
// Function #16
// Name: FUN_00019e74
// Address: 00019e74
// JNI: NO
// ============================================================


int * FUN_00019e74(int *param_1)

{
  *param_1 = *(int *)(DAT_00019e9c + 0x19e80) + 8;
  FUN_00019e3a(param_1 + 1);
  return param_1;
}




// ============================================================
// Function #17
// Name: FUN_00019ea0
// Address: 00019ea0
// JNI: NO
// ============================================================


int * FUN_00019ea0(int *param_1,byte *param_2)

{
  byte *pbVar1;
  
  *param_1 = *(int *)(DAT_00019ed4 + 0x19eac) + 8;
  pbVar1 = *(byte **)(param_2 + 8);
  if ((*param_2 & 1) == 0) {
    pbVar1 = param_2 + 1;
  }
  FUN_00019e3a(param_1 + 1,pbVar1);
  return param_1;
}




// ============================================================
// Function #18
// Name: FUN_00019ed8
// Address: 00019ed8
// JNI: NO
// ============================================================


int * FUN_00019ed8(int *param_1)

{
  *param_1 = *(int *)(DAT_00019f00 + 0x19ee4) + 8;
  FUN_00019e3a(param_1 + 1);
  return param_1;
}




// ============================================================
// Function #19
// Name: FUN_00019f04
// Address: 00019f04
// JNI: NO
// ============================================================


void FUN_00019f04(uint *param_1,uint param_2,uint param_3,int param_4,int param_5,int param_6,
                 int param_7,undefined4 param_8)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  byte *pbVar4;
  undefined1 *puVar5;
  
  puVar5 = &stack0xfffffff8;
  if (-param_2 - 10 < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_00019fd0();
  }
  pbVar4 = (byte *)param_1[2];
  if ((*param_1 & 1) == 0) {
    pbVar4 = (byte *)((int)param_1 + 1);
  }
  if (DAT_00019fcc < param_2) {
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
    __aeabi_memmove(uVar1,pbVar4,param_5);
  }
  if (param_7 != 0) {
    __aeabi_memcpy(uVar1 + param_5,param_8,param_7,param_6,puVar5);
  }
  param_4 = param_4 - (param_6 + param_5);
  if (param_4 != 0) {
    __aeabi_memmove(uVar1 + param_5 + param_7,pbVar4 + param_6 + param_5,param_4);
  }
  if (param_2 != 10) {
    FUN_00023f68(pbVar4);
  }
  uVar2 = param_7 + param_5 + param_4;
  param_1[2] = uVar1;
  *(undefined1 *)(uVar1 + uVar2) = 0;
  *param_1 = uVar3 | 1;
  param_1[1] = uVar2;
  return;
}




// ============================================================
// Function #20
// Name: FUN_00019fd0
// Address: 00019fd0
// JNI: NO
// ============================================================


/* WARNING: Control flow encountered bad instruction data */

void FUN_00019fd0(void)

{
  undefined4 extraout_r2;
  undefined4 *extraout_r3;
  
  FUN_0001a508(iRam00019fdc + 0x19fda);
  *extraout_r3 = extraout_r2;
  extraout_r3[1] = extraout_r3;
  extraout_r3[2] = &stack0xfffffff8;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}




