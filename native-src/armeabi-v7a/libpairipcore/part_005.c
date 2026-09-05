// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 81-100
// ============================================================

// ============================================================
// Function #81
// Name: FUN_0001aee0
// Address: 0001aee0
// JNI: NO
// ============================================================


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




// ============================================================
// Function #82
// Name: FUN_0001af2c
// Address: 0001af2c
// JNI: NO
// ============================================================


pthread_key_t * FUN_0001af2c(pthread_key_t *param_1)

{
  int iVar1;
  
  iVar1 = pthread_key_create(param_1,(__destr_function *)(DAT_0001af48 + 0x1af38));
  if (iVar1 == 0) {
    return param_1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001ac4c(iVar1,DAT_0001af4c + 0x1af46);
}




// ============================================================
// Function #83
// Name: FUN_0001af50
// Address: 0001af50
// JNI: NO
// ============================================================


undefined4 * FUN_0001af50(undefined4 *param_1)

{
  bool bVar1;
  int *piVar2;
  int *piVar3;
  int iVar4;
  undefined4 *puVar5;
  int *piVar6;
  undefined4 *puVar7;
  int *piVar8;
  
  puVar7 = (undefined4 *)param_1[4];
  for (puVar5 = (undefined4 *)param_1[3]; puVar5 != puVar7; puVar5 = puVar5 + 2) {
    FUN_0001add0(*puVar5);
    FUN_0001ae3c(puVar5[1]);
  }
  piVar8 = (int *)param_1[1];
  for (piVar6 = (int *)*param_1; piVar6 != piVar8; piVar6 = piVar6 + 1) {
    FUN_0001b066(*piVar6);
    piVar2 = (int *)*piVar6;
    DataMemoryBarrier(0x1b);
    piVar3 = piVar2 + 1;
    do {
      ExclusiveAccess(piVar3);
      iVar4 = *piVar3;
      bVar1 = (bool)hasExclusiveAccess(piVar3);
    } while (!bVar1);
    *piVar3 = iVar4 + -1;
    DataMemoryBarrier(0x1b);
    if (iVar4 == 0) {
      (**(code **)(*piVar2 + 8))();
    }
  }
  FUN_0001afc4(param_1 + 3);
  FUN_0001b036(&stack0xffffffec);
  return param_1;
}




// ============================================================
// Function #84
// Name: FUN_0001afc4
// Address: 0001afc4
// JNI: NO
// ============================================================


undefined4 FUN_0001afc4(undefined4 param_1)

{
  undefined4 local_14;
  
  local_14 = param_1;
  FUN_0001b020(&local_14);
  return param_1;
}




// ============================================================
// Function #85
// Name: FUN_0001afe8
// Address: 0001afe8
// JNI: NO
// ============================================================


undefined4 * FUN_0001afe8(undefined4 *param_1)

{
  undefined4 *puVar1;
  
  puVar1 = (undefined4 *)FUN_000a0370(0x18);
  puVar1[5] = 0;
  *param_1 = puVar1;
  *puVar1 = 0;
  puVar1[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar1[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar1[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar1[4] = 0;
  return param_1;
}




// ============================================================
// Function #86
// Name: FUN_0001b008
// Address: 0001b008
// JNI: NO
// ============================================================


int * FUN_0001b008(int *param_1)

{
  undefined4 uVar1;
  
  uVar1 = 0;
  if (*param_1 != 0) {
    uVar1 = FUN_0001af50();
  }
  FUN_00023f68(uVar1,0x18);
  return param_1;
}




// ============================================================
// Function #87
// Name: FUN_0001b020
// Address: 0001b020
// JNI: NO
// ============================================================


void FUN_0001b020(undefined4 *param_1)

{
  int iVar1;
  
  iVar1 = *(int *)*param_1;
  if (iVar1 != 0) {
    ((int *)*param_1)[1] = iVar1;
    FUN_00023f5c();
    return;
  }
  return;
}




// ============================================================
// Function #88
// Name: FUN_0001b036
// Address: 0001b036
// JNI: NO
// ============================================================


void FUN_0001b036(undefined4 *param_1)

{
  int iVar1;
  
  iVar1 = *(int *)*param_1;
  if (iVar1 != 0) {
    ((int *)*param_1)[1] = iVar1;
    FUN_00023f5c();
    return;
  }
  return;
}




// ============================================================
// Function #89
// Name: FUN_0001b04c
// Address: 0001b04c
// JNI: NO
// ============================================================


void FUN_0001b04c(int param_1)

{
  if (param_1 != 0) {
    FUN_0001b008(param_1);
  }
  FUN_00023f68(param_1,4);
  return;
}




// ============================================================
// Function #90
// Name: FUN_0001b066
// Address: 0001b066
// JNI: NO
// ============================================================


void FUN_0001b066(int param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  int local_18;
  undefined1 local_14;
  undefined3 uStack_13;
  
  _local_14 = CONCAT31((int3)((uint)param_4 >> 8),1);
  local_18 = param_1 + 0xc;
  FUN_0001ae24();
  *(uint *)(param_1 + 0x14) = *(uint *)(param_1 + 0x14) | 4;
  FUN_0001add0(param_1 + 0x10);
  FUN_0001ae4a(&local_18);
  return;
}




// ============================================================
// Function #91
// Name: FUN_0001b094
// Address: 0001b094
// JNI: NO
// ============================================================


/* WARNING: Removing unreachable block (ram,0x0001b0c6) */
/* WARNING: Removing unreachable block (ram,0x0001b0ce) */
/* WARNING: Removing unreachable block (ram,0x0001b12a) */
/* WARNING: Removing unreachable block (ram,0x0001b106) */

undefined4 FUN_0001b094(char *param_1)

{
  undefined4 uVar1;
  byte *pbVar2;
  uint uVar3;
  undefined1 auStack_14 [4];
  
  uVar1 = 0;
  pbVar2 = (byte *)(param_1 + 1);
  DataMemoryBarrier(0x1b);
  if (*param_1 == '\0') {
    FUN_0001b1dc(auStack_14,DAT_0001b140 + 0x1b0be);
    while( true ) {
      uVar3 = (uint)*pbVar2;
      if (-1 < (int)(uVar3 << 0x1e)) break;
      *pbVar2 = *pbVar2 | 4;
      pthread_cond_wait((pthread_cond_t *)(DAT_0001b148 + 0x1b0f8),
                        (pthread_mutex_t *)(DAT_0001b148 + 0x1b0f4));
    }
    if (uVar3 != 1) {
      *pbVar2 = 2;
    }
    FUN_0001b220(auStack_14);
    uVar1 = 0;
    if (uVar3 != 1) {
      uVar1 = 1;
    }
  }
  return uVar1;
}




// ============================================================
// Function #92
// Name: FUN_0001b14c
// Address: 0001b14c
// JNI: NO
// ============================================================


void FUN_0001b14c(undefined1 *param_1)

{
  byte bVar1;
  int iVar2;
  undefined1 auStack_1c [4];
  
  DataMemoryBarrier(0x1b);
  *param_1 = 1;
  FUN_0001b1dc(auStack_1c,DAT_0001b190 + 0x1b168);
  bVar1 = param_1[1];
  param_1[1] = 1;
  FUN_0001b220();
  if (((int)((uint)bVar1 << 0x1d) < 0) && (iVar2 = FUN_0001b24c(), iVar2 != 0)) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001b194 + 0x1b18c,DAT_0001b198 + 0x1b18e);
  }
  return;
}




// ============================================================
// Function #93
// Name: FUN_0001b19c
// Address: 0001b19c
// JNI: NO
// ============================================================


void FUN_0001b19c(int param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  byte bVar1;
  int iVar2;
  undefined4 uStack_14;
  
  uStack_14 = param_4;
  FUN_0001b1dc(&uStack_14,DAT_0001b1d0 + 0x1b1aa,param_3,param_4,param_3);
  bVar1 = *(byte *)(param_1 + 1);
  *(undefined1 *)(param_1 + 1) = 0;
  FUN_0001b220();
  if (((int)((uint)bVar1 << 0x1d) < 0) && (iVar2 = FUN_0001b24c(), iVar2 != 0)) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001b1d4 + 0x1b1ca,DAT_0001b1d8 + 0x1b1cc);
  }
  return;
}




// ============================================================
// Function #94
// Name: FUN_0001b1dc
// Address: 0001b1dc
// JNI: NO
// ============================================================


undefined4 * FUN_0001b1dc(undefined4 *param_1,undefined4 param_2)

{
  int iVar1;
  
  *param_1 = param_2;
  iVar1 = pthread_mutex_lock((pthread_mutex_t *)(DAT_0001b1fc + 0x1b1ea));
  if (iVar1 == 0) {
    return param_1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_0001b200 + 0x1b1fa,*param_1);
}




// ============================================================
// Function #95
// Name: FUN_0001b204
// Address: 0001b204
// JNI: NO
// ============================================================


long * FUN_0001b204(long *param_1)

{
  long lVar1;
  
  if ((char)param_1[1] == '\0') {
    lVar1 = syscall(0xe0);
    *param_1 = lVar1;
    *(undefined1 *)(param_1 + 1) = 1;
  }
  return param_1;
}




// ============================================================
// Function #96
// Name: FUN_0001b220
// Address: 0001b220
// JNI: NO
// ============================================================


undefined4 * FUN_0001b220(undefined4 *param_1)

{
  int iVar1;
  
  iVar1 = pthread_mutex_unlock((pthread_mutex_t *)(DAT_0001b244 + 0x1b22c));
  if (iVar1 == 0) {
    return param_1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_0001b248 + 0x1b23c,*param_1);
}




// ============================================================
// Function #97
// Name: FUN_0001b24c
// Address: 0001b24c
// JNI: NO
// ============================================================


bool FUN_0001b24c(void)

{
  int iVar1;
  
  iVar1 = pthread_cond_broadcast((pthread_cond_t *)(DAT_0001b264 + 0x1b25a));
  return iVar1 != 0;
}




// ============================================================
// Function #98
// Name: FUN_0001b268
// Address: 0001b268
// JNI: NO
// ============================================================


undefined4 FUN_0001b268(void)

{
  DataMemoryBarrier(0x1b);
  return **(undefined4 **)(DAT_0001b27c + 0x1b272);
}




// ============================================================
// Function #99
// Name: FUN_0001b280
// Address: 0001b280
// JNI: NO
// ============================================================


void FUN_0001b280(void)

{
  int *piVar1;
  int iVar2;
  int unaff_r4;
  
  piVar1 = (int *)FUN_0001b414();
  if (piVar1 != (int *)0x0) {
    unaff_r4 = *piVar1;
  }
  if (piVar1 != (int *)0x0 && unaff_r4 != 0) goto LAB_0001b2a0;
  do {
    DataMemoryBarrier(0x1b);
    FUN_0001b2d4(**(undefined4 **)(DAT_0001b2b8 + 0x1b296));
LAB_0001b2a0:
    iVar2 = FUN_00023fb0(unaff_r4 + 0x28);
  } while (iVar2 == 0);
  FUN_0001b2d4(*(undefined4 *)(unaff_r4 + 0x14));
                    /* WARNING: Subroutine does not return */
  FUN_00019740();
}




// ============================================================
// Function #100
// Name: FUN_0001b2bc
// Address: 0001b2bc
// JNI: NO
// ============================================================


undefined4 FUN_0001b2bc(void)

{
  DataMemoryBarrier(0x1b);
  return **(undefined4 **)(DAT_0001b2d0 + 0x1b2c6);
}




