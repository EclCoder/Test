// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 301-320
// ============================================================

// ============================================================
// Function #301
// Name: FUN_00021ca8
// Address: 00021ca8
// JNI: NO
// ============================================================


void FUN_00021ca8(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #302
// Name: FUN_00021d30
// Address: 00021d30
// JNI: NO
// ============================================================


void FUN_00021d30(undefined4 param_1)

{
  FUN_00023f68(param_1,0x18);
  return;
}




// ============================================================
// Function #303
// Name: FUN_00021dc0
// Address: 00021dc0
// JNI: NO
// ============================================================


void FUN_00021dc0(undefined4 param_1)

{
  FUN_00023f68(param_1,0x24);
  return;
}




// ============================================================
// Function #304
// Name: FUN_00021e24
// Address: 00021e24
// JNI: NO
// ============================================================


void FUN_00021e24(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #305
// Name: FUN_00021e32
// Address: 00021e32
// JNI: NO
// ============================================================


void FUN_00021e32(int param_1)

{
  FUN_000205b8(param_1 + 8);
  return;
}




// ============================================================
// Function #306
// Name: FUN_00021e40
// Address: 00021e40
// JNI: NO
// ============================================================


void FUN_00021e40(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #307
// Name: FUN_00021e74
// Address: 00021e74
// JNI: NO
// ============================================================


void FUN_00021e74(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #308
// Name: FUN_00021e82
// Address: 00021e82
// JNI: NO
// ============================================================


int FUN_00021e82(undefined4 *param_1,undefined4 param_2,int param_3,int param_4)

{
  char cVar1;
  int iVar2;
  int *piVar3;
  int local_18;
  int local_14;
  
  piVar3 = &local_14;
  local_18 = param_3;
  local_14 = param_4;
  if ((char *)param_1[1] != (char *)*param_1) {
    cVar1 = *(char *)*param_1;
    if (cVar1 == 'D') {
      iVar2 = FUN_0001e3d8(param_1);
      piVar3 = &local_18;
      local_18 = iVar2;
    }
    else {
      if (cVar1 != 'T') goto LAB_00021eae;
      iVar2 = FUN_0001e1e8(param_1);
      local_14 = iVar2;
    }
    if (iVar2 != 0) {
      FUN_0001d7c0(param_1 + 0x25,piVar3);
    }
    return iVar2;
  }
LAB_00021eae:
  iVar2 = FUN_0001e494(param_1,(char *)param_1[1],param_3,param_4);
  return iVar2;
}




// ============================================================
// Function #309
// Name: FUN_00021ed2
// Address: 00021ed2
// JNI: NO
// ============================================================


int FUN_00021ed2(undefined4 *param_1,undefined4 param_2,int param_3,int param_4)

{
  int iVar1;
  int local_18;
  int local_14;
  
  local_18 = param_3;
  local_14 = param_4;
  local_14 = FUN_0001dd58();
  if (local_14 == 0) {
    iVar1 = 0;
  }
  else {
    iVar1 = local_14;
    if (((char *)param_1[1] != (char *)*param_1) && (*(char *)*param_1 == 'I')) {
      iVar1 = 0;
      local_18 = FUN_0001df74(param_1,0);
      if (local_18 != 0) {
        iVar1 = FUN_0001e168(param_1,&local_14,&local_18);
      }
    }
  }
  return iVar1;
}




// ============================================================
// Function #310
// Name: FUN_00021f14
// Address: 00021f14
// JNI: NO
// ============================================================


void FUN_00021f14(int param_1,int *param_2,int *param_3)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  *(undefined1 *)(piVar1 + 1) = 0x17;
  iVar2 = *param_3;
  *piVar1 = DAT_00021f4c + 0x21f3a;
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #311
// Name: FUN_00021f50
// Address: 00021f50
// JNI: NO
// ============================================================


int * FUN_00021f50(undefined4 *param_1)

{
  int iVar1;
  int *piVar2;
  int local_20;
  int *local_1c;
  
  if (((byte *)param_1[1] != (byte *)*param_1) && (0xfffffff5 < *(byte *)*param_1 - 0x3a)) {
    piVar2 = (int *)FUN_00021ed2(param_1);
    return piVar2;
  }
  iVar1 = FUN_0001bec0(param_1,DAT_0002202c + 0x21f78,2);
  if (iVar1 == 0) {
    FUN_0001bec0(param_1,DAT_00022034 + 0x21fa0,2);
    local_1c = (int *)FUN_000220bc(param_1,0);
    if (local_1c != (int *)0x0) {
      if ((char *)param_1[1] == (char *)*param_1) {
        return local_1c;
      }
      if (*(char *)*param_1 != 'I') {
        return local_1c;
      }
      local_20 = FUN_0001df74(param_1,0);
      if (local_20 == 0) {
        return (int *)0x0;
      }
      piVar2 = (int *)FUN_0001e168(param_1,&local_1c,&local_20);
      return piVar2;
    }
  }
  else {
    if (((byte *)param_1[1] == (byte *)*param_1) || (*(byte *)*param_1 - 0x3a < 0xfffffff6)) {
      iVar1 = FUN_00021e82(param_1);
    }
    else {
      iVar1 = FUN_00021ed2(param_1);
    }
    if (iVar1 != 0) {
      piVar2 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
      *(undefined1 *)(piVar2 + 1) = 0x32;
      piVar2[2] = iVar1;
      *piVar2 = DAT_00022030 + 0x22014;
      *(ushort *)((int)piVar2 + 5) = (*(ushort *)((int)piVar2 + 5) & 0xf000) + 0x540;
      return piVar2;
    }
  }
  return (int *)0x0;
}




// ============================================================
// Function #312
// Name: FUN_00022038
// Address: 00022038
// JNI: NO
// ============================================================


void FUN_00022038(int param_1,int *param_2)

{
  int *piVar1;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0xc);
  *(undefined1 *)(piVar1 + 1) = 0x2e;
  *piVar1 = DAT_0002206c + 0x2205a;
  piVar1[2] = *param_2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #313
// Name: FUN_00022070
// Address: 00022070
// JNI: NO
// ============================================================


void FUN_00022070(int param_1,undefined4 param_2)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
  FUN_0001dcd6(param_2,DAT_00022098 + 0x22088,2);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0xc),param_2);
  return;
}




// ============================================================
// Function #314
// Name: FUN_0002209c
// Address: 0002209c
// JNI: NO
// ============================================================


void FUN_0002209c(undefined4 param_1,int param_2)

{
                    /* WARNING: Could not recover jumptable at 0x000220aa. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_2 + 0xc) + 0x1c))();
  return;
}




// ============================================================
// Function #315
// Name: FUN_000220ac
// Address: 000220ac
// JNI: NO
// ============================================================


void FUN_000220ac(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #316
// Name: FUN_000220bc
// Address: 000220bc
// JNI: NO
// ============================================================


int * FUN_000220bc(undefined4 *param_1,undefined1 *param_2)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  int *piVar4;
  byte *pbVar5;
  byte *pbVar6;
  int local_20 [2];
  
  iVar3 = FUN_0001fa3c();
  if (iVar3 == 0) {
    iVar3 = FUN_0001bec0(param_1,DAT_000221cc + 0x2211a,2);
    if (iVar3 == 0) {
      pbVar5 = (byte *)*param_1;
      if ((pbVar5 != (byte *)param_1[1]) && (*pbVar5 == 0x76)) {
        pbVar6 = pbVar5 + 1;
        *param_1 = pbVar6;
        if (((byte *)param_1[1] != pbVar6) && (*pbVar6 - 0x30 < 10)) {
          *param_1 = pbVar5 + 2;
          local_20[0] = FUN_0001dd58(param_1);
          if (local_20[0] != 0) {
            piVar4 = (int *)FUN_0002220c(param_1,local_20);
            return piVar4;
          }
        }
      }
    }
    else {
      iVar3 = FUN_0001dd58(param_1);
      if (iVar3 != 0) {
        piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
        piVar4[2] = iVar3;
        *(undefined1 *)(piVar4 + 1) = 0x14;
        *piVar4 = DAT_000221d0 + 0x22148;
        *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
        return piVar4;
      }
    }
  }
  else {
    bVar1 = *(byte *)(iVar3 + 2);
    if (bVar1 == 8) {
      uVar2 = *(undefined1 *)(param_1 + 0x61);
      *(undefined1 *)(param_1 + 0x61) = 0;
      bVar1 = *(byte *)((int)param_1 + 0x185);
      *(byte *)((int)param_1 + 0x185) = param_2 != (undefined1 *)0x0 | bVar1;
      local_20[0] = FUN_0001c660(param_1);
      if (local_20[0] == 0) {
        piVar4 = (int *)0x0;
      }
      else {
        if (param_2 != (undefined1 *)0x0) {
          *param_2 = 1;
        }
        piVar4 = (int *)FUN_0002220c(param_1,local_20);
      }
      *(undefined1 *)(param_1 + 0x61) = uVar2;
      *(byte *)((int)param_1 + 0x185) = bVar1;
      return piVar4;
    }
    if ((bVar1 < 0xb) && ((bVar1 != 4 || ((*(byte *)(iVar3 + 3) & 1) != 0)))) {
      FUN_00021842(local_20);
      piVar4 = (int *)FUN_0001e86c(param_1,local_20);
      return piVar4;
    }
  }
  return (int *)0x0;
}




// ============================================================
// Function #317
// Name: FUN_000221d4
// Address: 000221d4
// JNI: NO
// ============================================================


void FUN_000221d4(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,DAT_000221f8 + 0x221e4,1);
                    /* WARNING: Could not recover jumptable at 0x000221f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 8) + 0x10))(*(int **)(param_1 + 8),param_2);
  return;
}




// ============================================================
// Function #318
// Name: FUN_000221fc
// Address: 000221fc
// JNI: NO
// ============================================================


void FUN_000221fc(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #319
// Name: FUN_0002220c
// Address: 0002220c
// JNI: NO
// ============================================================


void FUN_0002220c(int param_1,int *param_2)

{
  int *piVar1;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0xc);
  *(undefined1 *)(piVar1 + 1) = 4;
  *piVar1 = DAT_00022240 + 0x2222e;
  piVar1[2] = *param_2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #320
// Name: FUN_00022244
// Address: 00022244
// JNI: NO
// ============================================================


void FUN_00022244(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,DAT_00022264 + 0x22254,9);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  return;
}




