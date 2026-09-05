// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 221-240
// ============================================================

// ============================================================
// Function #221
// Name: FUN_00020434
// Address: 00020434
// JNI: NO
// ============================================================


void FUN_00020434(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #222
// Name: FUN_00020442
// Address: 00020442
// JNI: NO
// ============================================================


void FUN_00020442(int param_1,undefined4 param_2)

{
  FUN_000203bc(*(undefined4 *)(param_1 + 8),param_2,
               (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a,1);
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10));
  return;
}




// ============================================================
// Function #223
// Name: FUN_0002046a
// Address: 0002046a
// JNI: NO
// ============================================================


void FUN_0002046a(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #224
// Name: FUN_00020478
// Address: 00020478
// JNI: NO
// ============================================================


void FUN_00020478(int param_1,undefined4 param_2)

{
  FUN_000203bc(*(undefined4 *)(param_1 + 8),param_2,
               (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a,0);
  FUN_000203aa(param_2,0x5b);
  FUN_000203bc(*(undefined4 *)(param_1 + 0xc),param_2,0x13,0);
  FUN_000203fa(param_2,0x5d);
  return;
}




// ============================================================
// Function #225
// Name: FUN_000204b2
// Address: 000204b2
// JNI: NO
// ============================================================


void FUN_000204b2(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #226
// Name: FUN_000204c0
// Address: 000204c0
// JNI: NO
// ============================================================


void FUN_000204c0(int param_1,undefined4 param_2)

{
  FUN_000203bc(*(undefined4 *)(param_1 + 8),param_2,
               (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a,1);
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10));
  FUN_000203bc(*(undefined4 *)(param_1 + 0x14),param_2,
               (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a,0);
  return;
}




// ============================================================
// Function #227
// Name: FUN_000204fa
// Address: 000204fa
// JNI: NO
// ============================================================


void FUN_000204fa(undefined4 param_1)

{
  FUN_00023f68(param_1,0x18);
  return;
}




// ============================================================
// Function #228
// Name: FUN_00020508
// Address: 00020508
// JNI: NO
// ============================================================


void FUN_00020508(int param_1,undefined4 param_2)

{
  if (*(char *)(param_1 + 0x1c) == '\x01') {
    FUN_0001dcd6(param_2,DAT_00020598 + 0x20520,2);
  }
  FUN_0001dcd6(param_2,DAT_0002059c + 0x2052c,3);
  if (*(char *)(param_1 + 0x1d) == '\x01') {
    FUN_0001dcd6(param_2,DAT_000205a0 + 0x2053e,2);
  }
  if (*(int *)(param_1 + 0xc) != 0) {
    FUN_000203aa(param_2,0x28);
    FUN_000205b8(param_1 + 8,param_2);
    FUN_000203fa(param_2,0x29);
  }
  FUN_0001dcd6(param_2,DAT_000205a4 + 0x20568,1);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
  if (*(int *)(param_1 + 0x18) != 0) {
    FUN_000203aa(param_2,0x28);
    FUN_000205b8(param_1 + 0x14,param_2);
    FUN_000203fa(param_2,0x29);
    return;
  }
  return;
}




// ============================================================
// Function #229
// Name: FUN_000205a8
// Address: 000205a8
// JNI: NO
// ============================================================


void FUN_000205a8(undefined4 param_1)

{
  FUN_00023f68(param_1,0x20);
  return;
}




// ============================================================
// Function #230
// Name: FUN_000205b8
// Address: 000205b8
// JNI: NO
// ============================================================


void FUN_000205b8(int *param_1,int param_2)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  
  iVar6 = 0;
  iVar3 = DAT_00020620 + 0x205d2;
  bVar2 = true;
  while (bVar1 = bVar2, iVar6 != param_1[1]) {
    iVar5 = *(int *)(param_2 + 4);
    iVar4 = iVar5;
    if (!bVar1) {
      FUN_0001dcd6(param_2,iVar3,2);
      iVar4 = *(int *)(param_2 + 4);
    }
    FUN_000203bc(*(undefined4 *)(*param_1 + iVar6 * 4),param_2,0x12,0);
    iVar6 = iVar6 + 1;
    bVar2 = false;
    if (iVar4 == *(int *)(param_2 + 4)) {
      *(int *)(param_2 + 4) = iVar5;
      bVar2 = bVar1;
    }
  }
  return;
}




// ============================================================
// Function #231
// Name: FUN_00020624
// Address: 00020624
// JNI: NO
// ============================================================


void FUN_00020624(int param_1,undefined4 param_2)

{
  if (*(char *)(param_1 + 0xc) == '\x01') {
    FUN_0001dcd6(param_2,DAT_00020670 + 0x2063c,2);
  }
  FUN_0001dcd6(param_2,DAT_00020674 + 0x20648,6);
  if (*(char *)(param_1 + 0xd) == '\x01') {
    FUN_0001dcd6(param_2,DAT_00020678 + 0x2065a,2);
  }
  FUN_0001bdc8(param_2,0x20);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  return;
}




// ============================================================
// Function #232
// Name: FUN_0002067c
// Address: 0002067c
// JNI: NO
// ============================================================


void FUN_0002067c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #233
// Name: FUN_0002068a
// Address: 0002068a
// JNI: NO
// ============================================================


void FUN_0002068a(int param_1,undefined4 param_2)

{
  if (*(char *)(param_1 + 0x14) == '\x01') {
    FUN_000203aa(param_2,0x28);
  }
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  if (*(char *)(param_1 + 0x14) == '\x01') {
    FUN_000203fa(param_2,0x29);
  }
  FUN_000203aa(param_2,0x28);
  FUN_000205b8(param_1 + 0xc,param_2);
  FUN_000203fa(param_2,0x29);
  return;
}




// ============================================================
// Function #234
// Name: FUN_000206d4
// Address: 000206d4
// JNI: NO
// ============================================================


void FUN_000206d4(undefined4 param_1)

{
  FUN_00023f68(param_1,0x18);
  return;
}




// ============================================================
// Function #235
// Name: FUN_000206e2
// Address: 000206e2
// JNI: NO
// ============================================================


void FUN_000206e2(int param_1,undefined4 param_2)

{
  FUN_000203aa(param_2,0x28);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  FUN_000203fa(param_2,0x29);
  FUN_000203aa(param_2,0x28);
  FUN_000205b8(param_1 + 0xc,param_2);
  FUN_000203fa(param_2,0x29);
  return;
}




// ============================================================
// Function #236
// Name: FUN_00020720
// Address: 00020720
// JNI: NO
// ============================================================


void FUN_00020720(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #237
// Name: FUN_00020794
// Address: 00020794
// JNI: NO
// ============================================================


void FUN_00020794(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #238
// Name: FUN_00020814
// Address: 00020814
// JNI: NO
// ============================================================


void FUN_00020814(undefined4 param_1)

{
  FUN_00023f68(param_1,0x18);
  return;
}




// ============================================================
// Function #239
// Name: FUN_00020824
// Address: 00020824
// JNI: NO
// ============================================================


void FUN_00020824(int *param_1,int param_2,int param_3,int param_4,ushort param_5)

{
  *(undefined1 *)(param_1 + 1) = 0x3c;
  param_1[2] = param_2;
  param_1[3] = param_3;
  param_1[4] = param_4;
  param_1[5] = 0;
  param_1[6] = 0;
  *param_1 = DAT_00020858 + 0x20848;
  *(ushort *)((int)param_1 + 5) =
       (param_5 & 0x3f) + (*(ushort *)((int)param_1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #240
// Name: FUN_0002085c
// Address: 0002085c
// JNI: NO
// ============================================================


void FUN_0002085c(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
  FUN_000203aa(uVar1,0x28);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
  FUN_000203fa(param_2,0x29);
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 0x14),*(undefined4 *)(param_1 + 0x18));
  return;
}




