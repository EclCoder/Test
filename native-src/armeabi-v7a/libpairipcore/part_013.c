// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 241-260
// ============================================================

// ============================================================
// Function #241
// Name: FUN_00020892
// Address: 00020892
// JNI: NO
// ============================================================


void FUN_00020892(undefined4 param_1)

{
  FUN_00023f68(param_1,0x1c);
  return;
}




// ============================================================
// Function #242
// Name: FUN_0002098c
// Address: 0002098c
// JNI: NO
// ============================================================


int * FUN_0002098c(undefined4 *param_1,int param_2)

{
  char cVar1;
  int iVar2;
  char *pcVar3;
  int *piVar4;
  int iVar5;
  int iVar6;
  char *pcVar7;
  undefined4 uVar8;
  int local_70;
  int iStack_6c;
  int local_68;
  int iStack_64;
  int local_60;
  int local_5c;
  int local_58;
  int iStack_54;
  
  if (param_2 != 0) {
    param_1[0x54] = param_1[0x53];
  }
  iVar2 = FUN_0001bec0(param_1,DAT_00020c08 + 0x209ac,2);
  if (iVar2 != 0) {
    FUN_0001c5c0(&local_58,param_1,0);
    pcVar3 = (char *)*param_1;
    if (pcVar3 == (char *)param_1[1]) {
      return (int *)0x0;
    }
    if (*pcVar3 != '_') {
      return (int *)0x0;
    }
    *param_1 = pcVar3 + 1;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x33;
    *piVar4 = DAT_00020c0c + 0x209f0;
    piVar4[2] = local_58;
    piVar4[3] = iStack_54;
    *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
    return piVar4;
  }
  iVar2 = FUN_0001bec0(param_1,DAT_00020c10 + 0x20a0e,2);
  if (iVar2 == 0) {
    iVar2 = FUN_0001bec0(param_1,DAT_00020c28 + 0x20a6c,2);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    FUN_0001c5c0(&local_58,param_1,0);
    pcVar3 = (char *)*param_1;
    if (pcVar3 == (char *)param_1[1]) {
      return (int *)0x0;
    }
    if (*pcVar3 != '_') {
      return (int *)0x0;
    }
    *param_1 = pcVar3 + 1;
    piVar4 = (int *)FUN_00021264(param_1,DAT_00020c2c + 0x20a9a);
    return piVar4;
  }
  uVar8 = param_1[0x62];
  param_1[0x62] = (int)(param_1[0x54] - param_1[0x53]) >> 2;
  iVar5 = FUN_00020f32(&local_58,param_1);
  piVar4 = param_1 + 2;
  iVar2 = param_1[3] - *piVar4 >> 2;
  while (iVar6 = FUN_00020f70(param_1), iVar6 != 0) {
    local_60 = FUN_00020fb0(param_1,iVar5 + 8);
    if (local_60 == 0) goto LAB_00020bc6;
    FUN_0001d7c0(piVar4,&local_60);
  }
  FUN_0001d830(&local_60,param_1,iVar2);
  if (local_5c == 0) {
    if (param_1[0x54] == param_1[0x53]) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b568(DAT_00020c14 + 0x20be8,DAT_00020c18 + 0x20bea,0x81,DAT_00020c1c + 0x20bec);
    }
    param_1[0x54] = param_1[0x54] + -4;
  }
  pcVar3 = (char *)*param_1;
  if ((pcVar3 == (char *)param_1[1]) || (*pcVar3 != 'Q')) {
    iVar5 = 0;
LAB_00020aee:
    iVar6 = FUN_0001bec0(param_1,DAT_00020c20 + 0x20af8,1);
    if (iVar6 == 0) {
      do {
        local_68 = FUN_0001c660(param_1);
        if (local_68 == 0) goto LAB_00020bc6;
        FUN_0001d7c0(piVar4,&local_68);
      } while (((char *)param_1[1] == (char *)*param_1) ||
              (cVar1 = *(char *)*param_1, cVar1 != 'Q' && cVar1 != 'E'));
    }
    FUN_0001d830(&local_68,param_1,iVar2);
    pcVar3 = (char *)*param_1;
    pcVar7 = (char *)param_1[1];
    if (pcVar3 != pcVar7) {
      if (*pcVar3 == 'Q') {
        *param_1 = pcVar3 + 1;
        iVar2 = FUN_0001d8c8(param_1);
        if (iVar2 == 0) goto LAB_00020bc6;
        pcVar3 = (char *)*param_1;
        pcVar7 = (char *)param_1[1];
      }
      else {
        iVar2 = 0;
      }
      if ((pcVar3 != pcVar7) && (*pcVar3 == 'E')) {
        *param_1 = pcVar3 + 1;
        piVar4 = (int *)0x0;
        FUN_0001c5c0(&local_70,param_1,0);
        pcVar3 = (char *)*param_1;
        if ((pcVar3 != (char *)param_1[1]) && (*pcVar3 == '_')) {
          *param_1 = pcVar3 + 1;
          piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0x28);
          *(undefined1 *)(piVar4 + 1) = 0x34;
          *piVar4 = DAT_00020c24 + 0x20ba6;
          piVar4[9] = iStack_6c;
          piVar4[2] = local_60;
          piVar4[3] = local_5c;
          piVar4[4] = iVar5;
          piVar4[5] = local_68;
          piVar4[6] = iStack_64;
          piVar4[7] = iVar2;
          piVar4[8] = local_70;
          *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
        }
        goto LAB_00020bc8;
      }
    }
  }
  else {
    *param_1 = pcVar3 + 1;
    iVar5 = FUN_0001d8c8(param_1);
    if (iVar5 != 0) goto LAB_00020aee;
  }
LAB_00020bc6:
  piVar4 = (int *)0x0;
LAB_00020bc8:
  FUN_00021214(&local_58);
  param_1[0x62] = uVar8;
  return piVar4;
}




// ============================================================
// Function #243
// Name: FUN_00020c30
// Address: 00020c30
// JNI: NO
// ============================================================


void FUN_00020c30(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  char *pcVar2;
  int iVar3;
  
  if (3 < *(uint *)(param_1 + 0xc)) {
    FUN_000203aa(param_2,0x28);
    uVar1 = FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
    FUN_000203fa(uVar1,0x29);
  }
  pcVar2 = *(char **)(param_1 + 0x10);
  if (*pcVar2 == 'n') {
    FUN_0001bdc8(param_2,0x2d);
    iVar3 = *(int *)(param_1 + 0x14) + -1;
    pcVar2 = (char *)(*(int *)(param_1 + 0x10) + 1);
  }
  else {
    iVar3 = *(int *)(param_1 + 0x14);
  }
  FUN_0001dcd6(param_2,pcVar2,iVar3);
  if (3 < *(uint *)(param_1 + 0xc)) {
    return;
  }
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8));
  return;
}




// ============================================================
// Function #244
// Name: FUN_00020c8c
// Address: 00020c8c
// JNI: NO
// ============================================================


void FUN_00020c8c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x18);
  return;
}




// ============================================================
// Function #245
// Name: FUN_00020ccc
// Address: 00020ccc
// JNI: NO
// ============================================================


void FUN_00020ccc(undefined4 param_1)

{
  FUN_00023f68(param_1,8);
  return;
}




// ============================================================
// Function #246
// Name: FUN_00020d70
// Address: 00020d70
// JNI: NO
// ============================================================


void FUN_00020d70(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #247
// Name: FUN_00020d7e
// Address: 00020d7e
// JNI: NO
// ============================================================


void FUN_00020d7e(undefined1 *param_1,undefined1 *param_2)

{
  undefined1 uVar1;
  
  if (param_1 != param_2) {
    for (; param_2 = param_2 + -1, param_1 < param_2; param_1 = param_1 + 1) {
      uVar1 = *param_1;
      *param_1 = *param_2;
      *param_2 = uVar1;
    }
  }
  return;
}




// ============================================================
// Function #248
// Name: FUN_00020dac
// Address: 00020dac
// JNI: NO
// ============================================================


void FUN_00020dac(int param_1,undefined4 param_2)

{
  char cVar1;
  int iVar2;
  char *pcVar3;
  int iVar4;
  char cVar5;
  char cVar6;
  char local_40 [4];
  undefined4 uStack_3c;
  undefined4 uStack_38;
  undefined4 uStack_34;
  undefined4 local_30;
  undefined4 uStack_2c;
  undefined4 uStack_28;
  undefined4 uStack_24;
  char local_20 [8];
  
  if (0xf < *(uint *)(param_1 + 0xc)) {
    iVar2 = *(int *)(param_1 + 8);
    pcVar3 = local_20;
    for (iVar4 = 0; iVar4 != 0x10; iVar4 = iVar4 + 2) {
      cVar5 = *(char *)(iVar2 + iVar4);
      if ((byte)(cVar5 - 0x3aU) < 0xf6) {
        cVar5 = cVar5 + '\t';
      }
      cVar1 = *(char *)(iVar2 + iVar4 + 1);
      cVar6 = -0x30;
      if ((byte)(cVar1 - 0x3aU) < 0xf6) {
        cVar6 = -0x57;
      }
      *pcVar3 = cVar1 + cVar6 + cVar5 * '\x10';
      pcVar3 = pcVar3 + 1;
    }
    FUN_00020d7e(local_20);
    uStack_3c = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    uStack_38 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    uStack_34 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    local_40[0] = '\0';
    local_40[1] = '\0';
    local_40[2] = '\0';
    local_40[3] = '\0';
    local_30 = 0;
    uStack_2c = uStack_3c;
    uStack_28 = uStack_38;
    uStack_24 = uStack_34;
    iVar2 = snprintf(local_40,0x20,(char *)(DAT_00020e38 + 0x20e22));
    FUN_0001dcd6(param_2,local_40,iVar2);
  }
  return;
}




// ============================================================
// Function #249
// Name: FUN_00020e3c
// Address: 00020e3c
// JNI: NO
// ============================================================


void FUN_00020e3c(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #250
// Name: FUN_00020ee0
// Address: 00020ee0
// JNI: NO
// ============================================================


void FUN_00020ee0(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #251
// Name: FUN_00020f24
// Address: 00020f24
// JNI: NO
// ============================================================


void FUN_00020f24(undefined4 param_1)

{
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #252
// Name: FUN_00020f32
// Address: 00020f32
// JNI: NO
// ============================================================


int * FUN_00020f32(int *param_1,int param_2,undefined4 param_3)

{
  int *piVar1;
  int iVar2;
  int iVar3;
  int *local_14;
  
  iVar2 = *(int *)(param_2 + 0x14c);
  iVar3 = *(int *)(param_2 + 0x150);
  piVar1 = param_1 + 5;
  *param_1 = param_2;
  param_1[3] = (int)piVar1;
  *piVar1 = 0;
  param_1[6] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  param_1[7] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  param_1[8] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  param_1[1] = iVar3 - iVar2 >> 2;
  local_14 = param_1 + 2;
  *local_14 = (int)piVar1;
  param_1[9] = 0;
  param_1[10] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  param_1[0xb] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  param_1[0xc] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  param_1[4] = (int)(param_1 + 0xd);
  FUN_0001e8dc(param_2 + 0x14c,&local_14,local_14,iVar3,param_3);
  return param_1;
}




// ============================================================
// Function #253
// Name: FUN_00020f70
// Address: 00020f70
// JNI: NO
// ============================================================


bool FUN_00020f70(undefined4 *param_1)

{
  char *pcVar1;
  int iVar2;
  char cVar3;
  
  pcVar1 = (char *)*param_1;
  if (((char *)param_1[1] != pcVar1) && (*pcVar1 == 'T')) {
    if ((uint)((int)param_1[1] - (int)pcVar1) < 2) {
      cVar3 = '\0';
    }
    else {
      cVar3 = pcVar1[1];
    }
    iVar2 = FUN_000212f2(&stack0xfffffff0,cVar3,0);
    return iVar2 != -1;
  }
  return false;
}




// ============================================================
// Function #254
// Name: FUN_00020fb0
// Address: 00020fb0
// JNI: NO
// ============================================================


int * FUN_00020fb0(undefined4 *param_1,undefined4 param_2)

{
  undefined1 uVar1;
  int iVar2;
  int *piVar3;
  int iVar4;
  char *pcVar5;
  char *pcVar6;
  int iVar7;
  int iVar8;
  int local_68;
  int iStack_64;
  undefined1 auStack_60 [52];
  undefined4 *local_2c;
  undefined4 *puStack_28;
  undefined4 local_24;
  
  puStack_28 = &local_24;
  local_2c = param_1;
  local_24 = param_2;
  iVar2 = FUN_0001bec0(param_1,DAT_000211ec + 0x20fce,2);
  if (iVar2 == 0) {
    iVar2 = FUN_0001bec0(param_1,DAT_000211f4 + 0x2100e,2);
    if (iVar2 != 0) {
      uVar1 = *(undefined1 *)((int)param_1 + 0x186);
      *(undefined1 *)((int)param_1 + 0x186) = 1;
      iVar2 = FUN_0001d34c(param_1,0);
      if (iVar2 == 0) {
        piVar3 = (int *)0x0;
      }
      else {
        iVar4 = FUN_00021308(&local_2c,0);
        piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
        FUN_0001e9c0(piVar3,0x24,0,1,1);
        piVar3[2] = iVar2;
        piVar3[3] = iVar4;
        *piVar3 = DAT_000211f8 + 0x21064;
      }
      *(undefined1 *)((int)param_1 + 0x186) = uVar1;
      return piVar3;
    }
    iVar2 = FUN_0001bec0(param_1,DAT_000211fc + 0x2106a,2);
    if (iVar2 == 0) {
      iVar2 = FUN_0001bec0(param_1,DAT_00021204 + 0x210b6,2);
      if (iVar2 != 0) {
        iVar2 = FUN_00021308(&local_2c,2);
        iVar8 = param_1[3];
        iVar7 = param_1[2];
        iVar4 = FUN_00020f32(auStack_60,param_1);
        pcVar5 = (char *)*param_1;
        pcVar6 = (char *)param_1[1];
        do {
          if ((pcVar5 != pcVar6) && (*pcVar5 == 'E')) {
            iVar4 = 0;
            goto LAB_00021186;
          }
          local_68 = FUN_00020fb0(param_1,iVar4 + 8);
          if (local_68 == 0) goto LAB_00021134;
          FUN_0001d7c0(param_1 + 2,&local_68);
          pcVar5 = (char *)*param_1;
          pcVar6 = (char *)param_1[1];
        } while ((pcVar5 == pcVar6) || (*pcVar5 != 'Q'));
        *param_1 = pcVar5 + 1;
        iVar4 = FUN_0001d8c8(param_1);
        if ((iVar4 == 0) ||
           ((pcVar5 = (char *)*param_1, pcVar5 == (char *)param_1[1] || (*pcVar5 != 'E')))) {
LAB_00021134:
          piVar3 = (int *)0x0;
        }
        else {
LAB_00021186:
          *param_1 = pcVar5 + 1;
          FUN_0001d830(&local_68,param_1,iVar8 - iVar7 >> 2);
          piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0x18);
          iVar7 = local_68;
          FUN_0001e9c0(piVar3,0x26,0,1,1);
          piVar3[2] = iVar2;
          piVar3[3] = iVar7;
          piVar3[4] = iStack_64;
          piVar3[5] = iVar4;
          *piVar3 = DAT_00021208 + 0x211ca;
        }
        FUN_00021214(auStack_60);
        return piVar3;
      }
      iVar2 = FUN_0001bec0(param_1,DAT_0002120c + 0x2114a,2);
      if (iVar2 == 0) {
        return (int *)0x0;
      }
      iVar2 = FUN_00020fb0(param_1,local_24);
      if (iVar2 == 0) {
        return (int *)0x0;
      }
      piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
      FUN_0001e9c0(piVar3,0x27,0,1,1);
      piVar3[2] = iVar2;
      iVar2 = DAT_00021210 + 0x2117e;
    }
    else {
      iVar2 = FUN_00021308(&local_2c,1);
      iVar4 = FUN_0001c660(param_1);
      if (iVar4 == 0) {
        return (int *)0x0;
      }
      piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      FUN_0001e9c0(piVar3,0x25,0,1,1);
      piVar3[2] = iVar2;
      piVar3[3] = iVar4;
      iVar2 = DAT_00021200 + 0x210ac;
    }
  }
  else {
    iVar2 = FUN_00021308(&local_2c,0);
    piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
    FUN_0001e9c0(piVar3,0x23,0,1,1);
    piVar3[2] = iVar2;
    iVar2 = DAT_000211f0 + 0x21000;
  }
  *piVar3 = iVar2 + 8;
  return piVar3;
}




// ============================================================
// Function #255
// Name: FUN_00021214
// Address: 00021214
// JNI: NO
// ============================================================


int * FUN_00021214(int *param_1)

{
  int iVar1;
  
  iVar1 = *param_1;
  if ((uint)param_1[1] <= (uint)(*(int *)(iVar1 + 0x150) - *(int *)(iVar1 + 0x14c) >> 2)) {
    *(int *)(iVar1 + 0x150) = *(int *)(iVar1 + 0x14c) + param_1[1] * 4;
    FUN_0001be62(param_1 + 2);
    return param_1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_00021258 + 0x2124c,DAT_0002125c + 0x2124e,0xac7,DAT_00021260 + 0x21250);
}




// ============================================================
// Function #256
// Name: FUN_00021264
// Address: 00021264
// JNI: NO
// ============================================================


int * FUN_00021264(int param_1,char *param_2)

{
  int *piVar1;
  size_t sVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  sVar2 = strlen(param_2);
  piVar1[2] = (int)param_2;
  piVar1[3] = sVar2;
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_000212a0 + 0x21292;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return piVar1;
}




// ============================================================
// Function #257
// Name: FUN_000212a4
// Address: 000212a4
// JNI: NO
// ============================================================


void FUN_000212a4(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  code *pcVar2;
  
  pcVar2 = (code *)(DAT_000212dc + 0x212bc);
  uVar1 = (*pcVar2)(param_2,DAT_000212d8 + 0x212b8,8);
  uVar1 = (*pcVar2)(uVar1,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
  (*pcVar2)(uVar1,DAT_000212e0 + 0x212ce,1);
  return;
}




// ============================================================
// Function #258
// Name: FUN_000212e4
// Address: 000212e4
// JNI: NO
// ============================================================


void FUN_000212e4(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #259
// Name: FUN_000212f2
// Address: 000212f2
// JNI: NO
// ============================================================


int FUN_000212f2(int *param_1,undefined4 param_2,uint param_3)

{
  int iVar1;
  int iVar2;
  
  iVar2 = *param_1;
  if (param_3 < (uint)param_1[1]) {
    iVar1 = FUN_0001a584(iVar2 + param_3,param_1[1] - param_3,&stack0xffffffef,param_3,param_2,
                         CONCAT13((char)param_2,(int3)param_3));
    iVar2 = iVar1 - iVar2;
    if (iVar1 == 0) {
      iVar2 = -1;
    }
    return iVar2;
  }
  return -1;
}




// ============================================================
// Function #260
// Name: FUN_00021308
// Address: 00021308
// JNI: NO
// ============================================================


int * FUN_00021308(int *param_1,int param_2)

{
  int iVar1;
  int *piVar2;
  int iVar3;
  int iVar4;
  int *local_1c;
  
  iVar1 = *param_1;
  iVar3 = iVar1 + param_2 * 4;
  iVar4 = *(int *)(iVar3 + 0x18c);
  *(int *)(iVar3 + 0x18c) = iVar4 + 1;
  piVar2 = (int *)FUN_0001dbc0(iVar1 + 0x198,0x10);
  piVar2[2] = param_2;
  piVar2[3] = iVar4;
  *(ushort *)((int)piVar2 + 5) = (*(ushort *)((int)piVar2 + 5) & 0xf000) + 0x540;
  *(undefined1 *)(piVar2 + 1) = 0x21;
  *piVar2 = DAT_0002136c + 0x2135a;
  if (*(int *)param_1[1] != 0) {
    local_1c = piVar2;
    FUN_00021370(*(int *)param_1[1],&local_1c);
  }
  return piVar2;
}




