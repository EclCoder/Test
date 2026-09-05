// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 161-180
// ============================================================

// ============================================================
// Function #161
// Name: FUN_0001dad0
// Address: 0001dad0
// JNI: NO
// ============================================================


undefined4 FUN_0001dad0(undefined4 *param_1,int *param_2,byte *param_3,byte *param_4)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  bool bVar4;
  bool bVar5;
  
  uVar1 = (uint)*param_4;
  if (0x2f < uVar1) {
    bVar5 = 0x39 < uVar1;
    bVar4 = uVar1 == 0x3a;
    if (bVar5) {
      uVar1 = uVar1 - 0x41;
      bVar4 = uVar1 == 0x19;
    }
    if ((!bVar5 || uVar1 < 0x19) || bVar4) {
      iVar2 = 0;
      while ((param_4 != param_3 && (uVar1 = (uint)*param_4, 0x2f < uVar1))) {
        if (uVar1 < 0x3a) {
          iVar3 = -0x30;
        }
        else {
          if (0x19 < uVar1 - 0x41) break;
          iVar3 = -0x37;
        }
        param_4 = param_4 + 1;
        *param_1 = param_4;
        iVar2 = iVar3 + iVar2 * 0x24 + uVar1;
      }
      *param_2 = iVar2;
      return 0;
    }
  }
  return 1;
}




// ============================================================
// Function #162
// Name: FUN_0001db28
// Address: 0001db28
// JNI: NO
// ============================================================


undefined4 FUN_0001db28(undefined4 *param_1,int *param_2)

{
  int iVar1;
  char *pcVar2;
  int iVar3;
  char *pcVar4;
  undefined1 uVar5;
  int *local_28;
  
  local_28 = (int *)&stack0xfffffff8;
  while( true ) {
    pcVar2 = (char *)*param_1;
    if ((pcVar2 == (char *)param_1[1]) || (*pcVar2 != 'W')) {
      return 0;
    }
    pcVar4 = pcVar2 + 1;
    *param_1 = pcVar4;
    if ((pcVar4 == (char *)param_1[1]) || (*pcVar4 != 'P')) {
      uVar5 = 0;
    }
    else {
      uVar5 = 1;
      *param_1 = pcVar2 + 2;
    }
    iVar3 = FUN_0001dd58(param_1);
    if (iVar3 == 0) break;
    local_28 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    local_28[2] = *param_2;
    *(ushort *)((int)local_28 + 5) = (*(ushort *)((int)local_28 + 5) & 0xf000) + 0x540;
    *(undefined1 *)(local_28 + 1) = 0x1b;
    iVar1 = DAT_0001dbbc;
    *(undefined1 *)(local_28 + 4) = uVar5;
    local_28[3] = iVar3;
    *local_28 = iVar1 + 0x1dba4;
    *param_2 = (int)local_28;
    FUN_0001d7c0(param_1 + 0x25,&local_28);
  }
  return 1;
}




// ============================================================
// Function #163
// Name: FUN_0001dbc0
// Address: 0001dbc0
// JNI: NO
// ============================================================


undefined4 * FUN_0001dbc0(int param_1,int param_2)

{
  undefined4 *puVar1;
  int iVar2;
  undefined4 *puVar3;
  uint uVar4;
  
  puVar3 = *(undefined4 **)(param_1 + 0x1000);
  uVar4 = param_2 + 0xfU & 0xfffffff0;
  iVar2 = puVar3[1];
  if (0xff7 < iVar2 + uVar4) {
    if (0xff8 < uVar4) {
      puVar1 = malloc(uVar4 | 8);
      if (puVar1 == (undefined4 *)0x0) goto LAB_0001dc2a;
      *puVar1 = *puVar3;
      puVar1[1] = 0;
      *puVar3 = puVar1;
      goto LAB_0001dc22;
    }
    puVar1 = malloc(0x1000);
    if (puVar1 == (undefined4 *)0x0) {
LAB_0001dc2a:
                    /* WARNING: Subroutine does not return */
      FUN_0001b280();
    }
    iVar2 = 0;
    *puVar1 = puVar3;
    puVar1[1] = 0;
    *(undefined4 **)(param_1 + 0x1000) = puVar1;
    puVar3 = puVar1;
  }
  puVar3[1] = iVar2 + uVar4;
  puVar1 = (undefined4 *)((int)puVar3 + iVar2);
LAB_0001dc22:
  return puVar1 + 2;
}




// ============================================================
// Function #164
// Name: FUN_0001dc30
// Address: 0001dc30
// JNI: NO
// ============================================================


void FUN_0001dc30(int *param_1,undefined1 param_2,ushort param_3,ushort param_4,short param_5,
                 short param_6)

{
  *(undefined1 *)(param_1 + 1) = param_2;
  *param_1 = DAT_0001dc68 + 0x1dc48;
  *(ushort *)((int)param_1 + 5) =
       param_3 & 0x3f | (param_4 & 3) << 6 | param_5 << 8 | param_6 << 10 |
       *(ushort *)((int)param_1 + 5) & 0xf000;
  return;
}




// ============================================================
// Function #165
// Name: FUN_0001dc6c
// Address: 0001dc6c
// JNI: NO
// ============================================================


undefined4 FUN_0001dc6c(void)

{
  return 0;
}




// ============================================================
// Function #166
// Name: FUN_0001dc74
// Address: 0001dc74
// JNI: NO
// ============================================================


undefined4 FUN_0001dc74(void)

{
  return 0;
}




// ============================================================
// Function #167
// Name: FUN_0001dc7c
// Address: 0001dc7c
// JNI: NO
// ============================================================


undefined4 FUN_0001dc7c(void)

{
  return 0;
}




// ============================================================
// Function #168
// Name: FUN_0001dc8a
// Address: 0001dc8a
// JNI: NO
// ============================================================


void FUN_0001dc8a(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
  return;
}




// ============================================================
// Function #169
// Name: FUN_0001dcae
// Address: 0001dcae
// JNI: NO
// ============================================================


undefined4 FUN_0001dcae(void)

{
  return 0;
}




// ============================================================
// Function #170
// Name: FUN_0001dcb6
// Address: 0001dcb6
// JNI: NO
// ============================================================


void FUN_0001dcb6(undefined4 *param_1)

{
  *param_1 = 0;
  param_1[1] = 0;
  return;
}




// ============================================================
// Function #171
// Name: FUN_0001dcc2
// Address: 0001dcc2
// JNI: NO
// ============================================================


void FUN_0001dcc2(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #172
// Name: FUN_0001dcd6
// Address: 0001dcd6
// JNI: NO
// ============================================================


int * FUN_0001dcd6(int *param_1,undefined4 param_2,int param_3)

{
  if (param_3 != 0) {
    FUN_0001be92(param_1,param_3);
    __aeabi_memcpy(*param_1 + param_1[1],param_2,param_3);
    param_1[1] = param_1[1] + param_3;
  }
  return param_1;
}




// ============================================================
// Function #173
// Name: FUN_0001dd48
// Address: 0001dd48
// JNI: NO
// ============================================================


void FUN_0001dd48(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #174
// Name: FUN_0001dd58
// Address: 0001dd58
// JNI: NO
// ============================================================


undefined4 FUN_0001dd58(int *param_1,int param_2,undefined4 param_3,uint param_4)

{
  int iVar1;
  undefined4 uVar2;
  int local_1c;
  uint uStack_18;
  uint local_14;
  
  local_1c = param_2;
  uStack_18 = param_3;
  local_14 = param_4;
  iVar1 = FUN_0001ddac(param_1,&local_14,param_3,param_4,param_1);
  if (((iVar1 == 0) && (local_1c = *param_1, local_14 <= (uint)(param_1[1] - local_1c))) &&
     (local_14 != 0)) {
    uStack_18 = local_14;
    *param_1 = local_1c + local_14;
    iVar1 = FUN_0001d2b8(local_1c,local_14,DAT_0001dda4 + 0x1dd84,10);
    if (iVar1 != 0) {
      uVar2 = FUN_0001de04(param_1,DAT_0001dda8 + 0x1dd90);
      return uVar2;
    }
    uVar2 = FUN_0001de44(param_1,&local_1c);
    return uVar2;
  }
  return 0;
}




// ============================================================
// Function #175
// Name: FUN_0001ddac
// Address: 0001ddac
// JNI: NO
// ============================================================


undefined4 FUN_0001ddac(undefined4 *param_1,int *param_2)

{
  undefined4 uVar1;
  byte *pbVar2;
  byte *pbVar3;
  int iVar4;
  
  *param_2 = 0;
  pbVar3 = (byte *)*param_1;
  pbVar2 = (byte *)param_1[1];
  if (pbVar2 != pbVar3) {
    if ((*pbVar3 < 0x30) || (0x39 < *pbVar3)) {
      uVar1 = 1;
    }
    else {
      iVar4 = 0;
      while ((pbVar3 != pbVar2 && (*pbVar3 - 0x30 < 10))) {
        *param_1 = pbVar3 + 1;
        *param_2 = iVar4 * 10;
        iVar4 = (uint)*pbVar3 + iVar4 * 10 + -0x30;
        *param_2 = iVar4;
        pbVar3 = pbVar3 + 1;
      }
      uVar1 = 0;
    }
    return uVar1;
  }
  return 1;
}




// ============================================================
// Function #176
// Name: FUN_0001ddbc
// Address: 0001ddbc
// JNI: NO
// ============================================================


undefined4 FUN_0001ddbc(undefined4 *param_1,int *param_2,byte *param_3,byte *param_4)

{
  undefined4 uVar1;
  int iVar2;
  
  if ((*param_4 < 0x30) || (0x39 < *param_4)) {
    uVar1 = 1;
  }
  else {
    iVar2 = 0;
    while ((param_4 != param_3 && (*param_4 - 0x30 < 10))) {
      *param_1 = param_4 + 1;
      *param_2 = iVar2 * 10;
      iVar2 = (uint)*param_4 + iVar2 * 10 + -0x30;
      *param_2 = iVar2;
      param_4 = param_4 + 1;
    }
    uVar1 = 0;
  }
  return uVar1;
}




// ============================================================
// Function #177
// Name: FUN_0001de04
// Address: 0001de04
// JNI: NO
// ============================================================


int * FUN_0001de04(int param_1,char *param_2)

{
  int *piVar1;
  size_t sVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  sVar2 = strlen(param_2);
  piVar1[2] = (int)param_2;
  piVar1[3] = sVar2;
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_0001de40 + 0x1de32;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return piVar1;
}




// ============================================================
// Function #178
// Name: FUN_0001de44
// Address: 0001de44
// JNI: NO
// ============================================================


void FUN_0001de44(int param_1,int *param_2)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_0001de7c + 0x1de66;
  iVar2 = param_2[1];
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #179
// Name: FUN_0001de80
// Address: 0001de80
// JNI: NO
// ============================================================


void FUN_0001de80(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 8),*(undefined4 *)(param_1 + 0xc));
  return;
}




// ============================================================
// Function #180
// Name: FUN_0001de94
// Address: 0001de94
// JNI: NO
// ============================================================


void FUN_0001de94(undefined4 *param_1,int param_2)

{
  undefined4 uVar1;
  
  uVar1 = *(undefined4 *)(param_2 + 0xc);
  *param_1 = *(undefined4 *)(param_2 + 8);
  param_1[1] = uVar1;
  return;
}




