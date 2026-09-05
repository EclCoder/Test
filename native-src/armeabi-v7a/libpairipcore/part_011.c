// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 201-220
// ============================================================

// ============================================================
// Function #201
// Name: FUN_0001e9d6
// Address: 0001e9d6
// JNI: NO
// ============================================================


undefined4 FUN_0001e9d6(int param_1)

{
  undefined4 uVar1;
  
  if (*(char *)(param_1 + 0x10) != '\0') {
    return 0;
  }
  *(undefined1 *)(param_1 + 0x10) = 1;
  uVar1 = FUN_0001eaae(*(undefined4 *)(param_1 + 0xc));
  *(undefined1 *)(param_1 + 0x10) = 0;
  return uVar1;
}




// ============================================================
// Function #202
// Name: FUN_0001eaae
// Address: 0001eaae
// JNI: NO
// ============================================================


uint FUN_0001eaae(undefined4 *param_1)

{
  byte bVar1;
  uint uVar2;
  
  bVar1 = (byte)*(undefined2 *)((int)param_1 + 5);
  if ((char)bVar1 < -0x40) {
                    /* WARNING: Could not recover jumptable at 0x0001eac6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (**(code **)*param_1)();
    return uVar2;
  }
  return (uint)(bVar1 < 0x40);
}




// ============================================================
// Function #203
// Name: FUN_0001ead4
// Address: 0001ead4
// JNI: NO
// ============================================================


uint FUN_0001ead4(int *param_1)

{
  uint uVar1;
  
  if ((*(byte *)((int)param_1 + 6) & 3) == 2) {
                    /* WARNING: Could not recover jumptable at 0x0001eaea. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(*param_1 + 4))();
    return uVar1;
  }
  return (uint)((*(byte *)((int)param_1 + 6) & 3) == 0);
}




// ============================================================
// Function #204
// Name: FUN_0001eaf4
// Address: 0001eaf4
// JNI: NO
// ============================================================


uint FUN_0001eaf4(int *param_1)

{
  uint uVar1;
  
  uVar1 = (*(ushort *)((int)param_1 + 5) & 0xfff) >> 10;
  if (uVar1 == 2) {
                    /* WARNING: Could not recover jumptable at 0x0001eb0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(*param_1 + 8))();
    return uVar1;
  }
  return (uint)(uVar1 == 0);
}




// ============================================================
// Function #205
// Name: FUN_0001eb18
// Address: 0001eb18
// JNI: NO
// ============================================================

/*
 * DECOMPILATION FAILED
 * Function: FUN_0001eb18
 * Address: 0001eb18
 */


// ============================================================
// Function #206
// Name: FUN_0001fa3c
// Address: 0001fa3c
// JNI: NO
// ============================================================


int FUN_0001fa3c(undefined4 *param_1)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  byte *pbVar6;
  
  pbVar6 = (byte *)*param_1;
  if ((uint)(param_1[1] - (int)pbVar6) < 2) {
    iVar2 = 0;
  }
  else {
    uVar3 = 0;
    iVar2 = DAT_0001fab8 + 0x1fa5e;
    uVar5 = 0x3e;
    while (uVar4 = uVar5, uVar4 != uVar3) {
      uVar5 = uVar4 + uVar3 >> 1;
      bVar1 = *(byte *)(iVar2 + uVar5 * 8);
      if ((bVar1 < *pbVar6) ||
         ((bVar1 == *pbVar6 && (*(byte *)(iVar2 + uVar5 * 8 + 1) < pbVar6[1])))) {
        uVar3 = uVar5 + 1;
        uVar5 = uVar4;
      }
    }
    if ((*(byte *)(iVar2 + uVar3 * 8) == *pbVar6) &&
       (iVar2 = iVar2 + uVar3 * 8, *(byte *)(iVar2 + 1) == pbVar6[1])) {
      *param_1 = pbVar6 + 2;
    }
    else {
      iVar2 = 0;
    }
  }
  return iVar2;
}




// ============================================================
// Function #207
// Name: FUN_0001fabc
// Address: 0001fabc
// JNI: NO
// ============================================================


void FUN_0001fabc(int *param_1,int param_2)

{
  int iVar1;
  int iVar2;
  char *pcVar3;
  int iVar4;
  
  FUN_0001bee0(param_1,*(undefined4 *)(param_2 + 4));
  if (*(byte *)(param_2 + 2) < 0xb) {
    iVar1 = FUN_0001d2b8(*param_1,param_1[1],DAT_0001fb18 + 0x1fadc,8);
    if (iVar1 == 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b568(DAT_0001fb1c + 0x1fb10,DAT_0001fb20 + 0x1fb12,0xbc1,DAT_0001fb24 + 0x1fb14);
    }
    iVar1 = *param_1;
    iVar2 = param_1[1];
    iVar4 = iVar2 + -8;
    pcVar3 = (char *)(iVar1 + 8);
    *param_1 = (int)pcVar3;
    param_1[1] = iVar4;
    if ((iVar4 != 0) && (*pcVar3 == ' ')) {
      *param_1 = iVar1 + 9;
      param_1[1] = iVar2 + -9;
    }
  }
  return;
}




// ============================================================
// Function #208
// Name: FUN_0001fb28
// Address: 0001fb28
// JNI: NO
// ============================================================


int * FUN_0001fb28(int param_1,int param_2,int param_3,ushort param_4)

{
  int iVar1;
  int *piVar2;
  
  iVar1 = FUN_0001eb18();
  if (iVar1 == 0) {
    piVar2 = (int *)0x0;
  }
  else {
    piVar2 = (int *)FUN_0001dbc0(param_1 + 0x198,0x14);
    piVar2[2] = param_2;
    piVar2[3] = param_3;
    *(undefined1 *)(piVar2 + 1) = 0x42;
    piVar2[4] = iVar1;
    *piVar2 = DAT_0001fb7c + 0x1fb66;
    *(ushort *)((int)piVar2 + 5) =
         (*(ushort *)((int)piVar2 + 5) & 0xf000) + (param_4 & 0x3f) + 0x540;
  }
  return piVar2;
}




// ============================================================
// Function #209
// Name: FUN_0001fb80
// Address: 0001fb80
// JNI: NO
// ============================================================


void FUN_0001fb80(int param_1,int *param_2,int *param_3,undefined1 *param_4,ushort *param_5)

{
  ushort uVar1;
  int *piVar2;
  int iVar3;
  
  piVar2 = (int *)FUN_0001dbc0(param_1 + 0x198,0x18);
  iVar3 = *param_2;
  *piVar2 = DAT_0001fbd4 + 0x1fba8;
  uVar1 = *param_5;
  piVar2[2] = iVar3;
  iVar3 = param_3[1];
  piVar2[3] = *param_3;
  piVar2[4] = iVar3;
  *(undefined1 *)(piVar2 + 5) = *param_4;
  *(undefined1 *)(piVar2 + 1) = 0x3f;
  *(ushort *)((int)piVar2 + 5) = (uVar1 & 0x3f) + (*(ushort *)((int)piVar2 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #210
// Name: FUN_00020078
// Address: 00020078
// JNI: NO
// ============================================================


undefined4 FUN_00020078(undefined4 *param_1,undefined4 param_2,undefined4 param_3,int param_4)

{
  int iVar1;
  undefined4 uVar2;
  char *pcVar3;
  undefined4 uStack_18;
  int local_14;
  
  uStack_18 = param_3;
  local_14 = param_4;
  iVar1 = FUN_0001bec0(param_1,DAT_00020118 + 0x20086,3);
  if (iVar1 != 0) {
    uVar2 = FUN_0001e94c(param_1,DAT_00020124 + 0x20092,uStack_18,local_14);
    return uVar2;
  }
  iVar1 = FUN_0001bec0(param_1,DAT_0002011c + 0x200a2,2);
  if (iVar1 == 0) {
    iVar1 = FUN_0001bec0(param_1,DAT_00020120 + 0x200e0,2);
    if (iVar1 == 0) {
      return 0;
    }
    FUN_0001c5c0(&uStack_18,param_1,0);
    if (local_14 == 0) {
      return 0;
    }
    pcVar3 = (char *)*param_1;
    if (pcVar3 == (char *)param_1[1]) {
      return 0;
    }
    if (*pcVar3 != 'p') {
      return 0;
    }
    *param_1 = pcVar3 + 1;
    FUN_0001e1a4(param_1);
  }
  else {
    FUN_0001e1a4(param_1);
  }
  uVar2 = 0;
  FUN_0001c5c0(&uStack_18,param_1,0);
  pcVar3 = (char *)*param_1;
  if ((pcVar3 != (char *)param_1[1]) && (*pcVar3 == '_')) {
    *param_1 = pcVar3 + 1;
    uVar2 = FUN_000217d4(param_1,&uStack_18);
  }
  return uVar2;
}




// ============================================================
// Function #211
// Name: FUN_00020128
// Address: 00020128
// JNI: NO
// ============================================================


int * FUN_00020128(undefined4 *param_1)

{
  char cVar1;
  char *pcVar2;
  int *piVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  undefined1 uStack_21;
  int local_20;
  int local_1c;
  
  pcVar2 = (char *)*param_1;
  if ((((char *)param_1[1] != pcVar2) && (1 < (uint)((int)param_1[1] - (int)pcVar2))) &&
     (*pcVar2 == 'd')) {
    cVar1 = pcVar2[1];
    if (cVar1 == 'X') {
      *param_1 = pcVar2 + 2;
      iVar4 = FUN_0001eb18(param_1);
      if (((iVar4 != 0) && (iVar5 = FUN_0001eb18(param_1), iVar5 != 0)) &&
         (iVar6 = FUN_00020128(param_1), iVar6 != 0)) {
        piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
        *(undefined1 *)(piVar3 + 1) = 0x52;
        piVar3[2] = iVar4;
        piVar3[3] = iVar5;
        piVar3[4] = iVar6;
        *piVar3 = DAT_00020210 + 0x201fa;
        *(ushort *)((int)piVar3 + 5) = (*(ushort *)((int)piVar3 + 5) & 0xf000) + 0x540;
        return piVar3;
      }
    }
    else if (cVar1 == 'x') {
      *param_1 = pcVar2 + 2;
      local_1c = FUN_0001eb18(param_1);
      if ((local_1c != 0) && (local_20 = FUN_00020128(param_1), local_20 != 0)) {
        uStack_21 = 1;
LAB_000201a0:
        piVar3 = (int *)FUN_000219e8(param_1,&local_1c,&local_20,&uStack_21);
        return piVar3;
      }
    }
    else {
      if (cVar1 != 'i') goto LAB_00020176;
      *param_1 = pcVar2 + 2;
      local_1c = FUN_0001dd58(param_1);
      if (local_1c != 0) {
        local_20 = FUN_00020128(param_1);
        uStack_21 = 0;
        if (local_20 == 0) {
          return (int *)0x0;
        }
        goto LAB_000201a0;
      }
    }
    return (int *)0x0;
  }
LAB_00020176:
  piVar3 = (int *)FUN_0001eb18(param_1);
  return piVar3;
}




// ============================================================
// Function #212
// Name: FUN_00020214
// Address: 00020214
// JNI: NO
// ============================================================


void FUN_00020214(int param_1,int *param_2)

{
  int *piVar1;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0xc);
  *(undefined1 *)(piVar1 + 1) = 0x2a;
  *piVar1 = DAT_00020248 + 0x20236;
  piVar1[2] = *param_2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #213
// Name: FUN_0002024c
// Address: 0002024c
// JNI: NO
// ============================================================


void FUN_0002024c(int param_1,undefined4 *param_2,undefined4 param_3,undefined4 param_4)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001dbc0(param_1 + 0x198,0x1c,param_3,param_4,param_3,param_4);
  FUN_00020824(uVar1,DAT_00020270 + 0x2026a,10,*param_2,0);
  return;
}




// ============================================================
// Function #214
// Name: FUN_00020274
// Address: 00020274
// JNI: NO
// ============================================================


int * FUN_00020274(int param_1,char *param_2)

{
  int *piVar1;
  size_t sVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  sVar2 = strlen(param_2);
  piVar1[2] = (int)param_2;
  piVar1[3] = sVar2;
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_000202b0 + 0x202a2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return piVar1;
}




// ============================================================
// Function #215
// Name: FUN_000202b4
// Address: 000202b4
// JNI: NO
// ============================================================


void FUN_000202b4(int param_1,int param_2)

{
  ushort uVar1;
  bool bVar2;
  undefined4 uVar3;
  int iVar4;
  
  if ((*(int *)(param_2 + 0x14) == 0) &&
     ((iVar4 = FUN_0001d2ce(*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10),
                            DAT_00020388 + 0x202d6,1), iVar4 != 0 ||
      (iVar4 = FUN_0001d2ce(*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10),
                            DAT_0002038c + 0x202e6,2), iVar4 != 0)))) {
    FUN_000203aa(param_2,0x28);
    bVar2 = true;
  }
  else {
    bVar2 = false;
  }
  uVar1 = *(ushort *)(param_1 + 5) << 10;
  iVar4 = (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a;
  if (uVar1 == 0x4400) {
    iVar4 = 0xf;
  }
  FUN_000203bc(*(undefined4 *)(param_1 + 8),param_2,iVar4,uVar1 != 0x4400);
  iVar4 = FUN_0001d2ce(*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10),
                       DAT_00020390 + 0x20328,1);
  if (iVar4 == 0) {
    FUN_0001dcd6(param_2,DAT_00020394 + 0x20336,1);
  }
  uVar3 = FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10));
  FUN_0001dcd6(uVar3,DAT_00020398 + 0x2034a,1);
  FUN_000203bc(*(undefined4 *)(param_1 + 0x14),param_2,
               (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a,DAT_00020384 + (uint)uVar1 == 0
              );
  if (bVar2) {
    FUN_000203fa(param_2,0x29);
    return;
  }
  return;
}




// ============================================================
// Function #216
// Name: FUN_0002039c
// Address: 0002039c
// JNI: NO
// ============================================================


void FUN_0002039c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x18);
  return;
}




// ============================================================
// Function #217
// Name: FUN_000203aa
// Address: 000203aa
// JNI: NO
// ============================================================


void FUN_000203aa(int param_1)

{
  *(int *)(param_1 + 0x14) = *(int *)(param_1 + 0x14) + 1;
  FUN_0001bdc8();
  return;
}




// ============================================================
// Function #218
// Name: FUN_000203bc
// Address: 000203bc
// JNI: NO
// ============================================================


void FUN_000203bc(int param_1,undefined4 param_2,int param_3,int param_4)

{
  if ((uint)((int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a) < (uint)(param_3 + param_4)) {
    FUN_0001bd9c(param_1,param_2);
    return;
  }
  FUN_000203aa(param_2,0x28);
  FUN_0001bd9c(param_1,param_2);
  FUN_000203fa(param_2,0x29);
  return;
}




// ============================================================
// Function #219
// Name: FUN_000203fa
// Address: 000203fa
// JNI: NO
// ============================================================


void FUN_000203fa(int param_1)

{
  *(int *)(param_1 + 0x14) = *(int *)(param_1 + 0x14) + -1;
  FUN_0001bdc8();
  return;
}




// ============================================================
// Function #220
// Name: FUN_0002040c
// Address: 0002040c
// JNI: NO
// ============================================================


void FUN_0002040c(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
  FUN_000203bc(*(undefined4 *)(param_1 + 0x10),param_2,
               (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a,0);
  return;
}




