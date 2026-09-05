// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 181-200
// ============================================================

// ============================================================
// Function #181
// Name: FUN_0001dea2
// Address: 0001dea2
// JNI: NO
// ============================================================


void FUN_0001dea2(undefined4 param_1)

{
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #182
// Name: FUN_0001deb0
// Address: 0001deb0
// JNI: NO
// ============================================================


void FUN_0001deb0(int param_1,undefined4 param_2)

{
  undefined4 uVar1;
  
  if ((*(int *)(param_1 + 8) == 0) ||
     (FUN_0001bd9c(*(int *)(param_1 + 8),param_2), *(int *)(param_1 + 8) == 0)) {
    if (*(char *)(param_1 + 0x10) != '\x01') goto LAB_0001dee0;
    uVar1 = 0x3a;
  }
  else {
    uVar1 = 0x2e;
    if ((*(byte *)(param_1 + 0x10) & 1) != 0) {
      uVar1 = 0x3a;
    }
  }
  FUN_0001bdc8(param_2,uVar1);
LAB_0001dee0:
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0xc),param_2);
  return;
}




// ============================================================
// Function #183
// Name: FUN_0001deec
// Address: 0001deec
// JNI: NO
// ============================================================


void FUN_0001deec(undefined4 param_1)

{
  FUN_00023f68(param_1,0x14);
  return;
}




// ============================================================
// Function #184
// Name: FUN_0001defc
// Address: 0001defc
// JNI: NO
// ============================================================


int FUN_0001defc(undefined4 *param_1,undefined4 param_2,undefined1 *param_3)

{
  int iVar1;
  int iVar2;
  
  iVar1 = FUN_0001bec0(param_1,DAT_0001df6c + 0x1df10,2);
  if (iVar1 == 0) {
    iVar1 = 0;
  }
  else {
    iVar1 = FUN_0001e454(param_1,DAT_0001df70 + 0x1df1e);
  }
  if (((char *)param_1[1] != (char *)*param_1) && (*(char *)*param_1 == 'S')) {
    iVar2 = FUN_0001e494(param_1);
    if (iVar2 != 0) {
      if (*(char *)(iVar2 + 4) == '\x1b') goto LAB_0001df52;
      if (iVar1 == 0) {
        *param_3 = 1;
        return iVar2;
      }
    }
    return 0;
  }
  iVar2 = 0;
LAB_0001df52:
  iVar1 = FUN_0001e5ac(param_1,param_2,iVar1,iVar2);
  return iVar1;
}




// ============================================================
// Function #185
// Name: FUN_0001df74
// Address: 0001df74
// JNI: NO
// ============================================================


int * FUN_0001df74(undefined4 *param_1,int param_2,undefined4 param_3,undefined4 param_4)

{
  char *pcVar1;
  int *piVar2;
  char *pcVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  ushort uVar8;
  int *piVar9;
  int *piVar10;
  undefined4 *puVar11;
  int *unaff_r5;
  int iVar12;
  int *piVar13;
  int unaff_r6;
  int iVar14;
  ushort uVar15;
  undefined4 *puVar16;
  int *local_28;
  
  local_28 = (int *)&stack0xfffffff8;
  pcVar1 = (char *)*param_1;
  pcVar3 = (char *)param_1[1];
  if ((pcVar1 != pcVar3) && (*pcVar1 == 'I')) {
    pcVar1 = pcVar1 + 1;
    *param_1 = pcVar1;
    if (param_2 != 0) {
      param_1[0x54] = param_1[0x53];
      unaff_r5 = param_1 + 0x48;
      FUN_0001e8dc(param_1 + 0x53,&stack0xffffffd0,0x49,param_4,param_2,param_3,param_4);
      pcVar1 = (char *)*param_1;
      pcVar3 = (char *)param_1[1];
      param_1[0x49] = param_1[0x48];
    }
    piVar2 = param_1 + 2;
    puVar11 = param_1 + 0x48;
    iVar5 = param_1[3] - *piVar2 >> 2;
    iVar6 = DAT_0001e160 + 0x1dfec;
    puVar16 = puVar11;
    do {
      if ((pcVar1 != pcVar3) && (*pcVar1 == 'E')) {
        iVar6 = 0;
        goto LAB_0001e11e;
      }
      if (param_2 == 0) {
        unaff_r5 = (int *)FUN_0001d668(param_1);
        if (unaff_r5 == (int *)0x0) {
          return (int *)0x0;
        }
        FUN_0001d7c0(piVar2,&stack0xffffffd0);
      }
      else {
        unaff_r5 = (int *)FUN_0001d668(param_1);
        if (unaff_r5 == (int *)0x0) {
          return (int *)0x0;
        }
        FUN_0001d7c0(piVar2,&stack0xffffffd0);
        local_28 = unaff_r5;
        if ((char)unaff_r5[1] == ')') {
          piVar10 = (int *)unaff_r5[2];
          iVar12 = unaff_r5[3];
          puVar11 = puVar16;
          local_28 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
          *(undefined1 *)(local_28 + 1) = 0x28;
          iVar14 = iVar12 << 2;
          *local_28 = iVar6;
          local_28[2] = (int)piVar10;
          local_28[3] = iVar12;
          uVar8 = *(ushort *)((int)local_28 + 5) & 0xf000;
          uVar15 = uVar8 + 0xa80;
          *(ushort *)((int)local_28 + 5) = uVar15;
          iVar12 = iVar14;
          piVar13 = piVar10;
          do {
            iVar7 = iVar14;
            piVar9 = piVar10;
            if (iVar12 == 0) {
              uVar15 = uVar8 | 0x980;
              *(ushort *)((int)local_28 + 5) = uVar15;
              break;
            }
            iVar4 = *piVar13;
            piVar13 = piVar13 + 1;
            iVar12 = iVar12 + -4;
          } while ((*(ushort *)(iVar4 + 5) & 0x300) == 0x100);
          do {
            if (iVar7 == 0) {
              uVar15 = uVar15 & 0xf3ff | 0x400;
              *(ushort *)((int)local_28 + 5) = uVar15;
              break;
            }
            iVar12 = *piVar9;
            iVar7 = iVar7 + -4;
            piVar9 = piVar9 + 1;
          } while ((*(ushort *)(iVar12 + 5) & 0xc00) == 0x400);
          do {
            puVar16 = puVar11;
            if (iVar14 == 0) {
              *(ushort *)((int)local_28 + 5) = uVar15 & 0xff7f | 0x40;
              break;
            }
            iVar12 = *piVar10;
            piVar10 = piVar10 + 1;
            iVar14 = iVar14 + -4;
          } while ((*(ushort *)(iVar12 + 5) & 0xc0) == 0x40);
        }
        else if ((char)unaff_r5[1] == '\"') {
          local_28 = (int *)unaff_r5[3];
        }
        FUN_00021370(puVar11,&local_28);
      }
      pcVar1 = (char *)*param_1;
      pcVar3 = (char *)param_1[1];
    } while ((pcVar1 == pcVar3) || (*pcVar1 != 'Q'));
    *param_1 = pcVar1 + 1;
    iVar6 = FUN_0001d8c8(param_1);
    if ((iVar6 != 0) &&
       ((pcVar1 = (char *)*param_1, pcVar1 != (char *)param_1[1] && (*pcVar1 == 'E')))) {
LAB_0001e11e:
      *param_1 = pcVar1 + 1;
      FUN_0001d830(&stack0xffffffd0,param_1,iVar5);
      piVar2 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
      *(undefined1 *)(piVar2 + 1) = 0x2b;
      *piVar2 = DAT_0001e164 + 0x1e14c;
      piVar2[2] = (int)unaff_r5;
      piVar2[3] = unaff_r6;
      piVar2[4] = iVar6;
      *(ushort *)((int)piVar2 + 5) = (*(ushort *)((int)piVar2 + 5) & 0xf000) + 0x540;
      return piVar2;
    }
  }
  return (int *)0x0;
}




// ============================================================
// Function #186
// Name: FUN_0001e168
// Address: 0001e168
// JNI: NO
// ============================================================


void FUN_0001e168(int param_1,int *param_2,int *param_3)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  *(undefined1 *)(piVar1 + 1) = 0x2d;
  iVar2 = *param_3;
  *piVar1 = DAT_0001e1a0 + 0x1e18e;
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #187
// Name: FUN_0001e1a4
// Address: 0001e1a4
// JNI: NO
// ============================================================


uint FUN_0001e1a4(undefined4 *param_1)

{
  uint uVar1;
  char *pcVar2;
  char *pcVar3;
  
  pcVar2 = (char *)*param_1;
  pcVar3 = (char *)param_1[1];
  if ((pcVar2 == pcVar3) || (*pcVar2 != 'r')) {
    uVar1 = 0;
  }
  else {
    pcVar2 = pcVar2 + 1;
    uVar1 = 4;
    *param_1 = pcVar2;
  }
  if ((pcVar2 != pcVar3) && (*pcVar2 == 'V')) {
    pcVar2 = pcVar2 + 1;
    *param_1 = pcVar2;
    uVar1 = uVar1 | 2;
  }
  if ((pcVar2 != pcVar3) && (*pcVar2 == 'K')) {
    *param_1 = pcVar2 + 1;
    uVar1 = uVar1 | 1;
  }
  return uVar1;
}




// ============================================================
// Function #188
// Name: FUN_0001e1e8
// Address: 0001e1e8
// JNI: NO
// ============================================================


int * FUN_0001e1e8(undefined4 *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined1 *puVar1;
  char *pcVar2;
  int iVar3;
  int *piVar4;
  undefined4 *puVar5;
  void *pvVar6;
  char *pcVar7;
  undefined1 *puVar8;
  int unaff_r6;
  char *pcVar9;
  int *piVar10;
  uint uVar11;
  int *__ptr;
  undefined1 *local_24;
  
  local_24 = &stack0xfffffff8;
  pcVar9 = (char *)*param_1;
  pcVar7 = (char *)param_1[1];
  if (pcVar9 == pcVar7) {
    return (int *)0x0;
  }
  if (*pcVar9 != 'T') {
    return (int *)0x0;
  }
  pcVar2 = pcVar9 + 1;
  *param_1 = pcVar2;
  if ((pcVar2 == pcVar7) || (*pcVar2 != 'L')) {
    puVar8 = (undefined1 *)0x0;
  }
  else {
    *param_1 = pcVar9 + 2;
    iVar3 = FUN_0001ddac(param_1,&local_24,0x4c,param_4,param_3,param_4);
    if (iVar3 != 0) {
      return (int *)0x0;
    }
    pcVar2 = (char *)*param_1;
    pcVar7 = (char *)param_1[1];
    if (pcVar2 == pcVar7) {
      return (int *)0x0;
    }
    if (*pcVar2 != '_') {
      return (int *)0x0;
    }
    pcVar2 = pcVar2 + 1;
    *param_1 = pcVar2;
    puVar8 = local_24 + 1;
  }
  if ((pcVar2 == pcVar7) || (*pcVar2 != '_')) {
    iVar3 = FUN_0001ddac(param_1,&stack0xffffffd8);
    if (iVar3 != 0) {
      return (int *)0x0;
    }
    pcVar2 = (char *)*param_1;
    if (pcVar2 == (char *)param_1[1]) {
      return (int *)0x0;
    }
    if (*pcVar2 != '_') {
      return (int *)0x0;
    }
    uVar11 = unaff_r6 + 1;
  }
  else {
    uVar11 = 0;
  }
  *param_1 = pcVar2 + 1;
  if (*(char *)((int)param_1 + 0x186) == '\x01') {
    piVar4 = (int *)FUN_0001e86c(param_1,&stack0xffffffd0);
    return piVar4;
  }
  if (*(char *)((int)param_1 + 0x185) != '\x01' || puVar8 != (undefined1 *)0x0) {
    puVar5 = param_1 + 0x53;
    if (((puVar8 < (undefined1 *)((int)(param_1[0x54] - param_1[0x53]) >> 2)) &&
        (piVar4 = (int *)FUN_0001e8a8(puVar5,puVar8), *piVar4 != 0)) &&
       (piVar4 = (int *)FUN_0001e8a8(puVar5,puVar8),
       uVar11 < (uint)(((int *)*piVar4)[1] - *(int *)*piVar4 >> 2))) {
      puVar5 = (undefined4 *)FUN_0001e8a8(puVar5,puVar8);
      puVar5 = (undefined4 *)FUN_0001e98c(*puVar5,uVar11);
      return (int *)*puVar5;
    }
    if (((undefined1 *)param_1[0x62] == puVar8) &&
       (puVar1 = (undefined1 *)((int)(param_1[0x54] - param_1[0x53]) >> 2), puVar8 <= puVar1)) {
      if (puVar8 == puVar1) {
        FUN_0001e8dc(puVar5,&stack0xffffffd0);
      }
      piVar4 = (int *)FUN_0001e94c(param_1,DAT_0001e3c8 + 0x1e372);
      return piVar4;
    }
    return (int *)0x0;
  }
  piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
  FUN_0001e9c0(piVar4,0x2c,2,2,2);
  *(undefined1 *)(piVar4 + 4) = 0;
  piVar4[2] = uVar11;
  piVar4[3] = 0;
  *piVar4 = DAT_0001e3c4 + 0x1e32a;
  if ((char)piVar4[1] != ',') {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001e3cc + 0x1e3b8,DAT_0001e3d0 + 0x1e3ba,0x171d,DAT_0001e3d4 + 0x1e3bc);
  }
  piVar10 = (int *)param_1[0x5b];
  if (piVar10 == (int *)param_1[0x5c]) {
    __ptr = (int *)param_1[0x5a];
    iVar3 = (int)piVar10 - (int)__ptr;
    if (__ptr == param_1 + 0x5d) {
      pvVar6 = malloc(iVar3 * 2);
      if (pvVar6 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (piVar10 != __ptr) {
        __aeabi_memmove4(pvVar6,__ptr,iVar3);
      }
      param_1[0x5a] = pvVar6;
    }
    else {
      pvVar6 = realloc(__ptr,iVar3 * 2);
      param_1[0x5a] = pvVar6;
      if (pvVar6 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
    }
    piVar10 = (int *)((int)pvVar6 + iVar3);
    param_1[0x5c] = (void *)((int)pvVar6 + (iVar3 >> 1) * 4);
  }
  *piVar10 = (int)piVar4;
  param_1[0x5b] = piVar10 + 1;
  return piVar4;
}




// ============================================================
// Function #189
// Name: FUN_0001e3d8
// Address: 0001e3d8
// JNI: NO
// ============================================================


undefined4 FUN_0001e3d8(undefined4 *param_1)

{
  byte bVar1;
  byte *pbVar2;
  int iVar3;
  char *pcVar4;
  undefined4 uVar5;
  byte *pbVar6;
  
  pbVar2 = (byte *)*param_1;
  if ((pbVar2 != (byte *)param_1[1]) && (*pbVar2 == 0x44)) {
    pbVar6 = pbVar2 + 1;
    *param_1 = pbVar6;
    if (pbVar6 != (byte *)param_1[1]) {
      bVar1 = *pbVar6;
      if (bVar1 != 0x74) {
        pbVar6 = (byte *)(uint)*pbVar6;
      }
      if (bVar1 == 0x74 || pbVar6 == (byte *)0x54) {
        *param_1 = pbVar2 + 2;
        iVar3 = FUN_0001eb18(param_1);
        if ((iVar3 != 0) && (pcVar4 = (char *)*param_1, pcVar4 != (char *)param_1[1])) {
          if (*pcVar4 != 'E') {
            return 0;
          }
          *param_1 = pcVar4 + 1;
          uVar5 = FUN_0001dbc0(param_1 + 0x66,0x1c);
          uVar5 = FUN_00020824(uVar5,DAT_0001e450 + 0x1e43e,8,iVar3,0);
          return uVar5;
        }
      }
    }
  }
  return 0;
}




// ============================================================
// Function #190
// Name: FUN_0001e454
// Address: 0001e454
// JNI: NO
// ============================================================


int * FUN_0001e454(int param_1,char *param_2)

{
  int *piVar1;
  size_t sVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  sVar2 = strlen(param_2);
  piVar1[2] = (int)param_2;
  piVar1[3] = sVar2;
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_0001e490 + 0x1e482;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return piVar1;
}




// ============================================================
// Function #191
// Name: FUN_0001e494
// Address: 0001e494
// JNI: NO
// ============================================================


int * FUN_0001e494(undefined4 *param_1)

{
  byte bVar1;
  byte *pbVar2;
  char *pcVar3;
  undefined4 *puVar4;
  int *piVar5;
  int *piVar6;
  uint uVar7;
  byte *pbVar8;
  int iVar9;
  int local_20;
  int *local_1c;
  
  pbVar2 = (byte *)*param_1;
  if ((pbVar2 == (byte *)param_1[1]) || (*pbVar2 != 0x53)) {
    return (int *)0x0;
  }
  pbVar8 = pbVar2 + 1;
  *param_1 = pbVar8;
  if ((byte *)param_1[1] != pbVar8) {
    bVar1 = *pbVar8;
    if (bVar1 < 0x61) {
      if (bVar1 == 0x5f) {
        *param_1 = pbVar2 + 2;
        if (param_1[0x25] == param_1[0x26]) {
          return (int *)0x0;
        }
        uVar7 = 0;
        goto LAB_0001e53a;
      }
    }
    else if (bVar1 < 0x7b) {
      iVar9 = 0;
      switch(bVar1) {
      case 0x61:
        break;
      case 0x62:
        iVar9 = 1;
        break;
      case 99:
      case 0x65:
      case 0x66:
      case 0x67:
      case 0x68:
        return (int *)0x0;
      case 100:
        iVar9 = 5;
        break;
      case 0x69:
        iVar9 = 3;
        break;
      default:
        if (bVar1 == 0x6f) {
          iVar9 = 4;
        }
        else {
          if (bVar1 != 0x73) {
            return (int *)0x0;
          }
          iVar9 = 2;
        }
      }
      *param_1 = pbVar2 + 2;
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
      *(undefined1 *)(piVar5 + 1) = 0x30;
      piVar5[2] = iVar9;
      *piVar5 = DAT_0001e5a8 + 0x1e57e;
      *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
      piVar6 = (int *)FUN_000222f0(param_1,piVar5);
      if (piVar6 != piVar5) {
        local_1c = piVar6;
        FUN_0001d7c0(param_1 + 0x25,&local_1c);
        return piVar6;
      }
      return piVar5;
    }
  }
  local_20 = 0;
  iVar9 = FUN_0001dac4(param_1,&local_20);
  if (iVar9 != 0) {
    return (int *)0x0;
  }
  pcVar3 = (char *)*param_1;
  if (pcVar3 == (char *)param_1[1]) {
    return (int *)0x0;
  }
  if (*pcVar3 != '_') {
    return (int *)0x0;
  }
  *param_1 = pcVar3 + 1;
  uVar7 = local_20 + 1;
  if ((uint)((int)(param_1[0x26] - param_1[0x25]) >> 2) <= uVar7) {
    return (int *)0x0;
  }
LAB_0001e53a:
  puVar4 = (undefined4 *)FUN_0002236c(param_1 + 0x25,uVar7);
  return (int *)*puVar4;
}




// ============================================================
// Function #192
// Name: FUN_0001e5ac
// Address: 0001e5ac
// JNI: NO
// ============================================================


int * FUN_0001e5ac(undefined4 *param_1,undefined1 *param_2,int *param_3,uint param_4)

{
  byte bVar1;
  bool bVar2;
  undefined1 uVar3;
  int iVar4;
  int *piVar5;
  byte *pbVar6;
  int *piVar7;
  char *pcVar8;
  byte *pbVar9;
  uint uVar10;
  byte *pbVar11;
  int iVar12;
  bool bVar13;
  int unaff_r4;
  uint local_34;
  undefined4 uStack_24;
  
  uStack_24 = &stack0xfffffff8;
  local_34 = param_4;
  iVar4 = FUN_0001db28(param_1,&stack0xffffffd4,param_3,param_4,param_3);
  if (iVar4 == 0) {
    pbVar6 = (byte *)*param_1;
    pbVar11 = (byte *)param_1[1];
    if (param_3 == (int *)0x0) {
LAB_0001e5e8:
      bVar2 = true;
LAB_0001e5ec:
      if ((pbVar6 != pbVar11) && (*pbVar6 == 0x4c)) {
        pbVar6 = pbVar6 + 1;
        *param_1 = pbVar6;
      }
      if ((pbVar11 == pbVar6) || (bVar1 = *pbVar6, bVar1 < 0x31)) goto LAB_0001e624;
      if (bVar1 < 0x3a) {
        piVar7 = (int *)FUN_0001dd58(param_1);
      }
      else {
        if (bVar1 != 0x55) goto LAB_0001e624;
        piVar7 = (int *)FUN_0002098c(param_1,param_2);
      }
    }
    else {
      if (pbVar6 != pbVar11) {
        if (*pbVar6 != 0x46) goto LAB_0001e5e8;
        pbVar6 = pbVar6 + 1;
        bVar2 = false;
        *param_1 = pbVar6;
        goto LAB_0001e5ec;
      }
      bVar2 = true;
LAB_0001e624:
      iVar4 = FUN_0001bec0(param_1,DAT_0001e854 + 0x1e62e,2);
      if (iVar4 == 0) {
        pbVar11 = (byte *)*param_1;
        pbVar6 = (byte *)param_1[1];
        if ((pbVar6 == pbVar11) || (1 < *pbVar11 - 0x43)) {
          piVar7 = (int *)FUN_000220bc(param_1,param_2);
        }
        else {
          if (param_3 == (int *)0x0) {
            return (int *)0x0;
          }
          if (param_4 != 0) {
            return (int *)0x0;
          }
          piVar7 = param_3;
          if ((char)param_3[1] == '0') {
            piVar7 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
            iVar12 = param_3[2];
            *(ushort *)((int)piVar7 + 5) = (*(ushort *)((int)piVar7 + 5) & 0xf000) + 0x540;
            *(undefined1 *)(piVar7 + 1) = 0x2f;
            iVar4 = DAT_0001e85c;
            piVar7[2] = iVar12;
            *piVar7 = iVar4 + 0x1e702;
            pbVar11 = (byte *)*param_1;
            pbVar6 = (byte *)param_1[1];
          }
          param_3 = piVar7;
          if (pbVar11 != pbVar6) {
            if (*pbVar11 != 0x43) {
              piVar7 = (int *)0x0;
              if ((((1 < (uint)((int)pbVar6 - (int)pbVar11)) && (*pbVar11 == 0x44)) &&
                  (uVar10 = pbVar11[1] - 0x30, uVar10 < 6)) && (uVar10 != 3)) {
                *param_1 = pbVar11 + 2;
                if (param_2 != (undefined1 *)0x0) {
                  *param_2 = 1;
                }
                uVar3 = 1;
                local_34 = uVar10;
LAB_0001e83a:
                uStack_24 = (undefined1 *)CONCAT13(uVar3,(undefined3)uStack_24);
                piVar7 = (int *)FUN_00022590(param_1,&stack0xffffffd8,(int)&uStack_24 + 3,&local_34)
                ;
              }
              goto LAB_0001e72e;
            }
            pbVar9 = pbVar11 + 1;
            *param_1 = pbVar9;
            if ((pbVar9 == pbVar6) || (*pbVar9 != 0x49)) {
              bVar13 = false;
            }
            else {
              pbVar9 = pbVar11 + 2;
              bVar13 = true;
              *param_1 = pbVar9;
            }
            if ((pbVar6 != pbVar9) && (bVar1 = *pbVar9, bVar1 - 0x31 < 5)) {
              *param_1 = pbVar9 + 1;
              local_34 = bVar1 - 0x30;
              if (param_2 != (undefined1 *)0x0) {
                *param_2 = 1;
              }
              if ((!bVar13) || (iVar4 = FUN_0001d34c(param_1,param_2), iVar4 != 0)) {
                uVar3 = 0;
                goto LAB_0001e83a;
              }
            }
          }
          piVar7 = (int *)0x0;
        }
      }
      else {
        iVar4 = param_1[2];
        iVar12 = param_1[3];
        do {
          local_34 = FUN_0001dd58(param_1);
          if (local_34 == 0) goto LAB_0001e5c6;
          FUN_0001d7c0(param_1 + 2,&local_34);
          pcVar8 = (char *)*param_1;
        } while ((pcVar8 == (char *)param_1[1]) || (*pcVar8 != 'E'));
        *param_1 = pcVar8 + 1;
        FUN_0001d830(&local_34,param_1,iVar12 - iVar4 >> 2);
        piVar7 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
        *(undefined1 *)(piVar7 + 1) = 0x35;
        *piVar7 = DAT_0001e858 + 0x1e690;
        piVar7[2] = local_34;
        piVar7[3] = unaff_r4;
        *(ushort *)((int)piVar7 + 5) = (*(ushort *)((int)piVar7 + 5) & 0xf000) + 0x540;
      }
    }
LAB_0001e72e:
    if ((piVar7 == (int *)0x0) || (param_4 == 0)) {
      if (piVar7 == (int *)0x0) goto LAB_0001e5c6;
    }
    else {
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      piVar5[2] = param_4;
      piVar5[3] = (int)piVar7;
      *(undefined1 *)(piVar5 + 1) = 0x1c;
      *piVar5 = DAT_0001e860 + 0x1e756;
      *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
      piVar7 = piVar5;
    }
    piVar7 = (int *)FUN_000222f0(param_1,piVar7);
    if (piVar7 == (int *)0x0 || bVar2) {
      if (param_3 == (int *)0x0 || piVar7 == (int *)0x0) {
        return piVar7;
      }
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      piVar5[2] = (int)param_3;
      piVar5[3] = (int)piVar7;
      *(undefined1 *)(piVar5 + 1) = 0x18;
      iVar4 = DAT_0001e868 + 0x1e7bc;
    }
    else {
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      piVar5[2] = (int)param_3;
      piVar5[3] = (int)piVar7;
      *(undefined1 *)(piVar5 + 1) = 0x19;
      iVar4 = DAT_0001e864 + 0x1e7a4;
    }
    *piVar5 = iVar4 + 8;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
  }
  else {
LAB_0001e5c6:
    piVar5 = (int *)0x0;
  }
  return piVar5;
}




// ============================================================
// Function #193
// Name: FUN_0001e86c
// Address: 0001e86c
// JNI: NO
// ============================================================


void FUN_0001e86c(int param_1,int *param_2)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_0001e8a4 + 0x1e88e;
  iVar2 = param_2[1];
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}




// ============================================================
// Function #194
// Name: FUN_0001e8a8
// Address: 0001e8a8
// JNI: NO
// ============================================================


int FUN_0001e8a8(int *param_1,uint param_2)

{
  if ((uint)(param_1[1] - *param_1 >> 2) <= param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001e8d0 + 0x1e8ca,DAT_0001e8d4 + 0x1e8cc,0x94,DAT_0001e8d8 + 0x1e8ce);
  }
  return *param_1 + param_2 * 4;
}




// ============================================================
// Function #195
// Name: FUN_0001e8ba
// Address: 0001e8ba
// JNI: NO
// ============================================================


void FUN_0001e8ba(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_0001e8d0 + 0x1e8ca,DAT_0001e8d4 + 0x1e8cc,0x94,DAT_0001e8d8 + 0x1e8ce);
}




// ============================================================
// Function #196
// Name: FUN_0001e8dc
// Address: 0001e8dc
// JNI: NO
// ============================================================


void FUN_0001e8dc(undefined4 *param_1,undefined4 *param_2)

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
// Function #197
// Name: FUN_0001e94c
// Address: 0001e94c
// JNI: NO
// ============================================================


int * FUN_0001e94c(int param_1,char *param_2)

{
  int *piVar1;
  size_t sVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  sVar2 = strlen(param_2);
  piVar1[2] = (int)param_2;
  piVar1[3] = sVar2;
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_0001e988 + 0x1e97a;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return piVar1;
}




// ============================================================
// Function #198
// Name: FUN_0001e98c
// Address: 0001e98c
// JNI: NO
// ============================================================


int FUN_0001e98c(int *param_1,uint param_2)

{
  if ((uint)(param_1[1] - *param_1 >> 2) <= param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001e9b4 + 0x1e9ae,DAT_0001e9b8 + 0x1e9b0,0x94,DAT_0001e9bc + 0x1e9b2);
  }
  return *param_1 + param_2 * 4;
}




// ============================================================
// Function #199
// Name: FUN_0001e99e
// Address: 0001e99e
// JNI: NO
// ============================================================


void FUN_0001e99e(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_0001e9b4 + 0x1e9ae,DAT_0001e9b8 + 0x1e9b0,0x94,DAT_0001e9bc + 0x1e9b2);
}




// ============================================================
// Function #200
// Name: FUN_0001e9c0
// Address: 0001e9c0
// JNI: NO
// ============================================================


void FUN_0001e9c0(undefined4 param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4,
                 undefined4 param_5)

{
  FUN_0001dc30(param_1,param_2,0,param_3,param_4,param_5);
  return;
}




