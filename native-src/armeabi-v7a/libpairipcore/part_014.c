// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 261-280
// ============================================================

// ============================================================
// Function #261
// Name: FUN_00021370
// Address: 00021370
// JNI: NO
// ============================================================


void FUN_00021370(undefined4 *param_1,undefined4 *param_2)

{
  void *pvVar1;
  undefined4 *puVar2;
  int iVar3;
  undefined4 *__ptr;
  
  puVar2 = (undefined4 *)param_1[1];
  if (puVar2 == (undefined4 *)param_1[2]) {
    __ptr = (undefined4 *)*param_1;
    iVar3 = (int)puVar2 - (int)__ptr;
    if (__ptr == param_1 + 3) {
      pvVar1 = malloc(iVar3 * 2);
      if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (puVar2 != __ptr) {
        __aeabi_memmove4(pvVar1,__ptr,iVar3);
      }
      *param_1 = pvVar1;
    }
    else {
      pvVar1 = realloc(__ptr,iVar3 * 2);
      *param_1 = pvVar1;
      if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
    }
    puVar2 = (undefined4 *)((int)pvVar1 + iVar3);
    param_1[2] = (void *)((int)pvVar1 + (iVar3 >> 1) * 4);
  }
  *puVar2 = *param_2;
  param_1[1] = puVar2 + 1;
  return;
}




// ============================================================
// Function #262
// Name: FUN_000213e0
// Address: 000213e0
// JNI: NO
// ============================================================


void FUN_000213e0(int param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  ulonglong uVar1;
  int iVar2;
  undefined4 uVar3;
  int iVar4;
  uint uVar5;
  int iVar6;
  ulonglong uVar7;
  undefined4 uVar8;
  undefined4 uStack_28;
  
  uStack_28 = &stack0xfffffff8;
  iVar2 = *(int *)(param_1 + 8);
  uVar8 = param_2;
  if (iVar2 == 0) {
    uVar3 = 2;
    iVar2 = DAT_0002146c + 0x21410;
  }
  else if (iVar2 == 2) {
    uVar3 = 3;
    iVar2 = DAT_00021474 + 0x21408;
  }
  else {
    if (iVar2 != 1) goto LAB_00021414;
    uVar3 = 2;
    iVar2 = DAT_00021470 + 0x21400;
  }
  FUN_0001dcd6(param_2,iVar2,uVar3,param_4,param_2,param_3);
LAB_00021414:
  if (*(int *)(param_1 + 0xc) != 0) {
    iVar2 = 0;
    uVar1 = (ulonglong)(*(int *)(param_1 + 0xc) - 1);
    do {
      iVar4 = iVar2;
      iVar6 = (int)(uVar1 >> 0x20);
      uVar5 = (uint)uVar1;
      uVar7 = FUN_00026034(uVar5,iVar6,10,0);
      *(byte *)((int)&uStack_28 + iVar4 + 3) = (char)uVar1 + (char)uVar7 * -10 | 0x30;
      iVar2 = iVar4 + -1;
      uVar1 = uVar7;
    } while ((uint)(uVar5 < 10) <= (uint)-iVar6);
    FUN_0001dcd6(param_2,(int)&uStack_28 + iVar4 + 3,-(iVar4 + -1),&stack0xffffffc7 + iVar4,uVar8,
                 param_3);
  }
  return;
}




// ============================================================
// Function #263
// Name: FUN_00021478
// Address: 00021478
// JNI: NO
// ============================================================


void FUN_00021478(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #264
// Name: FUN_000214a0
// Address: 000214a0
// JNI: NO
// ============================================================


void FUN_000214a0(int param_1)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
  return;
}




// ============================================================
// Function #265
// Name: FUN_000214ae
// Address: 000214ae
// JNI: NO
// ============================================================


void FUN_000214ae(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #266
// Name: FUN_000214bc
// Address: 000214bc
// JNI: NO
// ============================================================


void FUN_000214bc(int param_1,undefined4 param_2)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
  FUN_0001dcd6(param_2,DAT_000214d8 + 0x214d2,1);
  return;
}




// ============================================================
// Function #267
// Name: FUN_000214dc
// Address: 000214dc
// JNI: NO
// ============================================================


void FUN_000214dc(int param_1)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0xc));
  return;
}




// ============================================================
// Function #268
// Name: FUN_000214ea
// Address: 000214ea
// JNI: NO
// ============================================================


void FUN_000214ea(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #269
// Name: FUN_000214f8
// Address: 000214f8
// JNI: NO
// ============================================================


void FUN_000214f8(int param_1,undefined4 param_2)

{
  int iVar1;
  
  (**(code **)(**(int **)(param_1 + 0xc) + 0x10))(*(int **)(param_1 + 0xc),param_2);
  iVar1 = FUN_0001eaae(*(undefined4 *)(param_1 + 0xc),param_2);
  if (iVar1 != 0) {
    return;
  }
  FUN_0001dcd6(param_2,DAT_00021528 + 0x21520,1);
  return;
}




// ============================================================
// Function #270
// Name: FUN_0002152c
// Address: 0002152c
// JNI: NO
// ============================================================


void FUN_0002152c(int param_1,undefined4 param_2)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
                    /* WARNING: Could not recover jumptable at 0x00021546. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 0xc) + 0x14))(*(int **)(param_1 + 0xc),param_2);
  return;
}




// ============================================================
// Function #271
// Name: FUN_00021548
// Address: 00021548
// JNI: NO
// ============================================================


void FUN_00021548(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #272
// Name: FUN_000215a4
// Address: 000215a4
// JNI: NO
// ============================================================


void FUN_000215a4(int param_1,undefined4 param_2)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
  if (*(int *)(param_1 + 0x14) != 0) {
    FUN_0001dcd6(param_2,DAT_000215d0 + 0x215c0,10);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x14),param_2);
    return;
  }
  return;
}




// ============================================================
// Function #273
// Name: FUN_000215d4
// Address: 000215d4
// JNI: NO
// ============================================================


void FUN_000215d4(undefined4 param_1)

{
  FUN_00023f68(param_1,0x18);
  return;
}




// ============================================================
// Function #274
// Name: FUN_00021608
// Address: 00021608
// JNI: NO
// ============================================================


void FUN_00021608(int param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00021616. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 8) + 0x14))();
  return;
}




// ============================================================
// Function #275
// Name: FUN_00021618
// Address: 00021618
// JNI: NO
// ============================================================


void FUN_00021618(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #276
// Name: FUN_0002166c
// Address: 0002166c
// JNI: NO
// ============================================================


void FUN_0002166c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x28);
  return;
}




// ============================================================
// Function #277
// Name: FUN_0002167c
// Address: 0002167c
// JNI: NO
// ============================================================


void FUN_0002167c(int param_1,int param_2)

{
  undefined4 uVar1;
  
  if (*(int *)(param_1 + 0xc) != 0) {
    uVar1 = *(undefined4 *)(param_2 + 0x14);
    *(undefined4 *)(param_2 + 0x14) = 0;
    FUN_0001dcd6(param_2,DAT_00021720 + 0x2169c,1);
    FUN_000205b8(param_1 + 8,param_2);
    FUN_0001dcd6(param_2,DAT_00021724 + 0x216b2,1);
    *(undefined4 *)(param_2 + 0x14) = uVar1;
  }
  if (*(int *)(param_1 + 0x10) != 0) {
    FUN_0001dcd6(param_2,DAT_00021728 + 0x216c4,10);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
    FUN_0001dcd6(param_2,DAT_0002172c + 0x216d8,1);
  }
  FUN_000203aa(param_2,0x28);
  FUN_000205b8(param_1 + 0x14,param_2);
  FUN_000203fa(param_2,0x29);
  if (*(int *)(param_1 + 0x1c) != 0) {
    FUN_0001dcd6(param_2,DAT_00021730 + 0x21702,10);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x1c),param_2);
    return;
  }
  return;
}




// ============================================================
// Function #278
// Name: FUN_00021734
// Address: 00021734
// JNI: NO
// ============================================================


void FUN_00021734(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,DAT_00021768 + 0x21744,2);
  if (*(char *)(*(int *)(param_1 + 8) + 4) == '4') {
    FUN_0002167c(*(int *)(param_1 + 8),param_2);
  }
  FUN_0001dcd6(param_2,DAT_0002176c + 0x21760,5);
  return;
}




// ============================================================
// Function #279
// Name: FUN_00021770
// Address: 00021770
// JNI: NO
// ============================================================


void FUN_00021770(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #280
// Name: FUN_0002177e
// Address: 0002177e
// JNI: NO
// ============================================================


void FUN_0002177e(int param_1,undefined4 param_2)

{
  char *pcVar1;
  int iVar2;
  
  FUN_000203aa(param_2,0x28);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  FUN_000203fa(param_2,0x29);
  pcVar1 = *(char **)(param_1 + 0xc);
  if (*pcVar1 == 'n') {
    FUN_0001bdc8(param_2,0x2d);
    iVar2 = *(int *)(param_1 + 0x10) + -1;
    pcVar1 = (char *)(*(int *)(param_1 + 0xc) + 1);
  }
  else {
    iVar2 = *(int *)(param_1 + 0x10);
  }
  FUN_0001dcd6(param_2,pcVar1,iVar2);
  return;
}




