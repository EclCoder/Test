// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 141-160
// ============================================================

// ============================================================
// Function #141
// Name: FUN_0001bec0
// Address: 0001bec0
// JNI: NO
// ============================================================


void FUN_0001bec0(int *param_1,undefined4 param_2,int param_3)

{
  int iVar1;
  
  iVar1 = FUN_0001d2b8(*param_1,param_1[1] - *param_1,param_2,param_3);
  if (iVar1 != 0) {
    *param_1 = *param_1 + param_3;
  }
  return;
}




// ============================================================
// Function #142
// Name: FUN_0001bee0
// Address: 0001bee0
// JNI: NO
// ============================================================


undefined4 * FUN_0001bee0(undefined4 *param_1,char *param_2)

{
  size_t sVar1;
  
  *param_1 = param_2;
  sVar1 = strlen(param_2);
  param_1[1] = sVar1;
  return param_1;
}




// ============================================================
// Function #143
// Name: FUN_0001bef4
// Address: 0001bef4
// JNI: NO
// ============================================================


int * FUN_0001bef4(undefined4 *param_1)

{
  char cVar1;
  bool bVar2;
  undefined1 uVar3;
  char *pcVar4;
  int *piVar5;
  undefined4 *puVar6;
  int iVar7;
  uint uVar8;
  int *piVar9;
  int iVar10;
  int *piVar11;
  int iVar12;
  int *piVar13;
  char *pcVar14;
  undefined *puVar15;
  int iVar16;
  undefined4 *puVar17;
  uint uVar18;
  undefined4 uVar19;
  int *local_90;
  int iStack_8c;
  undefined4 local_88;
  int local_84;
  undefined1 local_80;
  uint local_7c;
  byte local_78;
  undefined4 *local_74;
  undefined1 auStack_70 [76];
  
  FUN_0001d2f0(auStack_70,param_1);
  pcVar4 = (char *)*param_1;
  pcVar14 = (char *)param_1[1];
  if (pcVar14 == pcVar4) {
LAB_0001bf72:
    local_80 = 0;
    local_84 = 0;
    local_88 = local_88 & 0xffff0000;
    local_78 = 0;
    local_7c = (int)(param_1[0x5b] - param_1[0x5a]) >> 2;
    local_74 = param_1;
    piVar9 = (int *)FUN_0001d34c(param_1,&local_88);
    if (piVar9 != (int *)0x0) {
      iVar7 = param_1[0x5a];
      iVar10 = param_1[0x5b];
      puVar17 = param_1 + 0x53;
      for (uVar8 = local_7c; uVar8 < (uint)(iVar10 - iVar7 >> 2); uVar8 = uVar8 + 1) {
        piVar5 = (int *)FUN_000229c8(param_1 + 0x5a,uVar8);
        if (param_1[0x53] == param_1[0x54]) goto LAB_0001c4f0;
        uVar18 = *(uint *)(*piVar5 + 8);
        piVar5 = (int *)FUN_0001e8a8(puVar17,0);
        if ((*piVar5 == 0) ||
           (piVar5 = (int *)FUN_0001e8a8(puVar17,0),
           (uint)(((int *)*piVar5)[1] - *(int *)*piVar5 >> 2) <= uVar18)) goto LAB_0001c4f0;
        puVar6 = (undefined4 *)FUN_0001e8a8(puVar17,0);
        puVar6 = (undefined4 *)FUN_0001e98c(*puVar6,uVar18);
        uVar19 = *puVar6;
        piVar5 = (int *)FUN_000229c8(param_1 + 0x5a,uVar8);
        *(undefined4 *)(*piVar5 + 0xc) = uVar19;
      }
      if ((uint)((int)(param_1[0x5b] - param_1[0x5a]) >> 2) < local_7c) {
                    /* WARNING: Subroutine does not return */
        FUN_0001b568(DAT_0001c5a8 + 0x1c55a,DAT_0001c5ac + 0x1c55c,0x86,DAT_0001c5b0 + 0x1c55e);
      }
      param_1[0x5b] = param_1[0x5a] + local_7c * 4;
      iVar7 = FUN_0001d640(&local_74);
      if (iVar7 != 0) goto LAB_0001c4f2;
      iVar7 = FUN_0001bec0(param_1,DAT_0001c31c + 0x1c08e,0xd);
      if (iVar7 == 0) {
        piVar5 = (int *)0x0;
LAB_0001c408:
        if (((char)local_88 == '\0') && (local_88._1_1_ == '\x01')) {
          iVar7 = FUN_0001c660(param_1);
          if (iVar7 == 0) goto LAB_0001c4f0;
        }
        else {
          iVar7 = 0;
        }
        pcVar14 = (char *)*param_1;
        pcVar4 = (char *)param_1[1];
        if ((pcVar14 == pcVar4) || (*pcVar14 != 'v')) {
          iVar10 = param_1[3] - param_1[2];
          iVar16 = DAT_0001c5b8 + 0x1c466;
          do {
            piVar11 = (int *)FUN_0001c660(param_1);
            local_90 = piVar11;
            if (piVar11 == (int *)0x0) goto LAB_0001c4f0;
            if ((iVar10 == param_1[3] - param_1[2]) && ((local_78 & 1) != 0)) {
              local_90 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
              local_90[2] = (int)piVar11;
              *(undefined1 *)(local_90 + 1) = 0x57;
              *local_90 = iVar16;
              *(ushort *)((int)local_90 + 5) = (*(ushort *)((int)local_90 + 5) & 0xf000) + 0x540;
            }
            FUN_0001d7c0(param_1 + 2,&local_90);
            iVar12 = FUN_0001d640(&local_74);
          } while ((iVar12 == 0) &&
                  (((char *)param_1[1] == (char *)*param_1 || (*(char *)*param_1 != 'Q'))));
          FUN_0001d830(&local_90,param_1,iVar10 >> 2);
          pcVar14 = (char *)*param_1;
          pcVar4 = (char *)param_1[1];
          iVar10 = iStack_8c;
          piVar11 = local_90;
        }
        else {
          pcVar14 = pcVar14 + 1;
          *param_1 = pcVar14;
          iVar10 = 0;
          piVar11 = (int *)0x0;
        }
        if ((pcVar14 == pcVar4) || (*pcVar14 != 'Q')) {
          iVar16 = 0;
        }
        else {
          *param_1 = pcVar14 + 1;
          iVar16 = FUN_0001d8c8(param_1);
          if (iVar16 == 0) goto LAB_0001c4f0;
        }
        piVar13 = (int *)FUN_0001dbc0(param_1 + 0x66,0x28);
        uVar3 = local_80;
        iVar12 = local_84;
        FUN_0001e9c0(piVar13,0x13,0,1,0);
        piVar13[2] = iVar7;
        piVar13[3] = (int)piVar9;
        *(undefined1 *)(piVar13 + 9) = uVar3;
        piVar13[4] = (int)piVar11;
        piVar13[5] = iVar10;
        piVar13[6] = (int)piVar5;
        piVar13[7] = iVar16;
        piVar13[8] = iVar12;
        *piVar13 = DAT_0001c5bc + 0x1c552;
        piVar9 = piVar13;
        goto LAB_0001c4f2;
      }
      iVar7 = param_1[2];
      iVar10 = param_1[3];
      while( true ) {
        pcVar4 = (char *)*param_1;
        if ((pcVar4 != (char *)param_1[1]) && (*pcVar4 == 'E')) {
          *param_1 = pcVar4 + 1;
          FUN_0001d830(&local_90,param_1,iVar10 - iVar7 >> 2);
          piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
          *(undefined1 *)(piVar5 + 1) = 10;
          *piVar5 = DAT_0001c5b4 + 0x1c3f6;
          piVar5[2] = (int)local_90;
          piVar5[3] = iStack_8c;
          *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
          goto LAB_0001c408;
        }
        local_90 = (int *)FUN_0001d668(param_1);
        if (local_90 == (int *)0x0) break;
        FUN_0001d7c0(param_1 + 2,&local_90);
      }
    }
    goto LAB_0001c4f0;
  }
  if (*pcVar4 == 'G') {
    if ((uint)((int)pcVar14 - (int)pcVar4) < 2) goto LAB_0001c4f0;
    cVar1 = pcVar4[1];
    piVar9 = (int *)0x0;
    if (cVar1 == 'I') {
      *param_1 = pcVar4 + 2;
      local_88 = 0;
      iVar7 = FUN_0001db28(param_1,&local_88);
      uVar8 = local_88;
      if ((iVar7 != 0) || (local_88 == 0)) goto LAB_0001c4f2;
      piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
      *(undefined1 *)(piVar9 + 1) = 0x15;
      iVar7 = 0x17;
      puVar15 = (undefined *)(DAT_0001c324 + 0x1c178);
    }
    else if (cVar1 == 'R') {
      *param_1 = pcVar4 + 2;
      uVar8 = FUN_0001d34c(param_1,0);
      if (uVar8 == 0) goto LAB_0001c4f2;
      iVar7 = FUN_0001dac4(param_1,&local_88);
      pcVar4 = (char *)*param_1;
      if ((pcVar4 == (char *)param_1[1]) || (*pcVar4 != '_')) {
        if (iVar7 == 0) goto LAB_0001c4f2;
      }
      else {
        *param_1 = pcVar4 + 1;
      }
      piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
      *(undefined1 *)(piVar9 + 1) = 0x15;
      iVar7 = 0x18;
      puVar15 = (undefined *)(DAT_0001c5a4 + 0x1c252);
    }
    else {
      if (cVar1 != 'V') goto LAB_0001c4f2;
      *param_1 = pcVar4 + 2;
      uVar8 = FUN_0001d34c(param_1,0);
      if (uVar8 == 0) goto LAB_0001c4f2;
      piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
      *(undefined1 *)(piVar9 + 1) = 0x15;
      iVar7 = 0x13;
      puVar15 = (undefined *)(DAT_0001c318 + 0x1c060);
    }
    goto LAB_0001c382;
  }
  if (*pcVar4 != 'T') goto LAB_0001bf72;
  if ((uint)((int)pcVar14 - (int)pcVar4) < 2) {
switchD_0001bf38_caseD_55:
    pcVar4 = pcVar4 + 1;
    *param_1 = pcVar4;
    if (pcVar14 == pcVar4) {
      bVar2 = false;
    }
    else {
      bVar2 = *pcVar4 == 'v';
    }
    iVar7 = FUN_0001da44(param_1);
    if ((iVar7 == 0) && (iVar7 = FUN_0001bef4(param_1), iVar7 != 0)) {
      piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
      iVar10 = 0x15;
      *(undefined1 *)(piVar9 + 1) = 0x15;
      *piVar9 = DAT_0001c598 + 0x1c214;
      *(ushort *)((int)piVar9 + 5) = (*(ushort *)((int)piVar9 + 5) & 0xf000) + 0x540;
      if (bVar2) {
        iVar10 = 0x11;
        iVar16 = DAT_0001c59c + 0x1c228;
      }
      else {
        iVar16 = DAT_0001c5a0 + 0x1c22e;
      }
      piVar9[2] = iVar16;
      piVar9[3] = iVar10;
      piVar9[4] = iVar7;
      goto LAB_0001c4f2;
    }
LAB_0001c4f0:
    piVar9 = (int *)0x0;
    goto LAB_0001c4f2;
  }
  cVar1 = pcVar4[1];
  switch(cVar1) {
  case 'A':
    *param_1 = pcVar4 + 2;
    uVar8 = FUN_0001d668(param_1);
    if (uVar8 == 0) goto LAB_0001c4f0;
    piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    *(undefined1 *)(piVar9 + 1) = 0x15;
    iVar7 = 0x1e;
    puVar15 = (undefined *)(DAT_0001c320 + 0x1c10c);
    break;
  case 'B':
  case 'D':
  case 'E':
  case 'F':
  case 'G':
    goto switchD_0001bf38_caseD_55;
  case 'C':
    *param_1 = pcVar4 + 2;
    iVar7 = FUN_0001c660(param_1);
    if (((iVar7 == 0) || (FUN_0001c5c0(&local_88,param_1,1), local_84 == 0)) ||
       ((pcVar4 = (char *)*param_1, pcVar4 == (char *)param_1[1] || (*pcVar4 != '_'))))
    goto LAB_0001c4f0;
    *param_1 = pcVar4 + 1;
    iVar10 = FUN_0001c660(param_1);
    if (iVar10 == 0) goto LAB_0001c4f0;
    piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    *(undefined1 *)(piVar9 + 1) = 0x16;
    piVar9[2] = iVar10;
    piVar9[3] = iVar7;
    iVar7 = DAT_0001c58c + 0x1c2e6;
    goto LAB_0001c38c;
  case 'H':
    *param_1 = pcVar4 + 2;
    uVar8 = FUN_0001d34c(param_1,0);
    if (uVar8 == 0) goto LAB_0001c4f0;
    piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    *(undefined1 *)(piVar9 + 1) = 0x15;
    iVar7 = 0x28;
    puVar15 = (undefined *)(DAT_0001c594 + 0x1c280);
    break;
  case 'I':
    *param_1 = pcVar4 + 2;
    uVar8 = FUN_0001c660(param_1);
    if (uVar8 == 0) goto LAB_0001c4f0;
    piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    *(undefined1 *)(piVar9 + 1) = 0x15;
    iVar7 = 0xd;
    puVar15 = &UNK_0001c312 + DAT_0001c588;
    break;
  default:
    switch(cVar1) {
    case 'S':
      *param_1 = pcVar4 + 2;
      uVar8 = FUN_0001c660(param_1);
      if (uVar8 != 0) {
        piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
        *(undefined1 *)(piVar9 + 1) = 0x15;
        iVar7 = 0x12;
        puVar15 = (undefined *)(DAT_0001c314 + 0x1bf72);
        goto LAB_0001c382;
      }
      break;
    case 'T':
      *param_1 = pcVar4 + 2;
      uVar8 = FUN_0001c660(param_1);
      if (uVar8 != 0) {
        piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
        *(undefined1 *)(piVar9 + 1) = 0x15;
        iVar7 = 8;
        puVar15 = (undefined *)(DAT_0001c584 + 0x1c384);
        goto LAB_0001c382;
      }
      break;
    case 'U':
      goto switchD_0001bf38_caseD_55;
    case 'V':
      *param_1 = pcVar4 + 2;
      uVar8 = FUN_0001c660(param_1);
      if (uVar8 != 0) {
        piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
        *(undefined1 *)(piVar9 + 1) = 0x15;
        iVar7 = 0xb;
        puVar15 = (undefined *)(DAT_0001c580 + 0x1c358);
        goto LAB_0001c382;
      }
      break;
    case 'W':
      *param_1 = pcVar4 + 2;
      local_88 = FUN_0001d34c(param_1,0);
      if (local_88 != 0) {
        piVar9 = (int *)FUN_0001c610(param_1,DAT_0001c590 + 0x1c3c2,&local_88);
        goto LAB_0001c4f2;
      }
      break;
    default:
      if (cVar1 != 'c') goto switchD_0001bf38_caseD_55;
      *param_1 = pcVar4 + 2;
      iVar7 = FUN_0001da44(param_1);
      if (((iVar7 == 0) && (iVar7 = FUN_0001da44(param_1), iVar7 == 0)) &&
         (uVar8 = FUN_0001bef4(param_1), uVar8 != 0)) {
        piVar9 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
        *(undefined1 *)(piVar9 + 1) = 0x15;
        iVar7 = 0x1a;
        puVar15 = (undefined *)(DAT_0001c328 + 0x1c1c4);
        goto LAB_0001c382;
      }
    }
    goto LAB_0001c4f0;
  }
LAB_0001c382:
  piVar9[2] = (int)puVar15;
  piVar9[3] = iVar7;
  piVar9[4] = uVar8;
  iVar7 = DAT_0001c57c + 0x1c38e;
LAB_0001c38c:
  *piVar9 = iVar7 + 8;
  *(ushort *)((int)piVar9 + 5) = (*(ushort *)((int)piVar9 + 5) & 0xf000) + 0x540;
LAB_0001c4f2:
  FUN_0001d8ec(auStack_70);
  return piVar9;
}




// ============================================================
// Function #144
// Name: FUN_0001c5c0
// Address: 0001c5c0
// JNI: NO
// ============================================================


void FUN_0001c5c0(undefined4 *param_1,undefined4 *param_2,int param_3)

{
  int iVar1;
  byte *pbVar2;
  byte *pbVar3;
  byte *pbVar4;
  byte *pbVar5;
  
  pbVar3 = (byte *)*param_2;
  pbVar4 = (byte *)param_2[1];
  pbVar2 = pbVar3;
  if (param_3 == 0) {
LAB_0001c5de:
    if ((pbVar4 != pbVar2) && (0xfffffff5 < *pbVar2 - 0x3a)) {
      while ((pbVar5 = pbVar4, pbVar2 != pbVar4 && (pbVar5 = pbVar2, 0xfffffff5 < *pbVar2 - 0x3a)))
      {
        pbVar2 = pbVar2 + 1;
        *param_2 = pbVar2;
      }
      iVar1 = (int)pbVar5 - (int)pbVar3;
      goto LAB_0001c60a;
    }
  }
  else if (pbVar3 != pbVar4) {
    if (*pbVar3 == 0x6e) {
      pbVar2 = pbVar3 + 1;
      *param_2 = pbVar2;
    }
    goto LAB_0001c5de;
  }
  pbVar3 = (byte *)0x0;
  iVar1 = 0;
LAB_0001c60a:
  *param_1 = pbVar3;
  param_1[1] = iVar1;
  return;
}




// ============================================================
// Function #145
// Name: FUN_0001c610
// Address: 0001c610
// JNI: NO
// ============================================================


int * FUN_0001c610(int param_1,char *param_2,int *param_3)

{
  int *piVar1;
  size_t sVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x14);
  sVar2 = strlen(param_2);
  piVar1[2] = (int)param_2;
  piVar1[3] = sVar2;
  *(undefined1 *)(piVar1 + 1) = 0x15;
  *piVar1 = DAT_0001c65c + 0x1c644;
  piVar1[4] = *param_3;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return piVar1;
}




// ============================================================
// Function #146
// Name: FUN_0001c660
// Address: 0001c660
// JNI: NO
// ============================================================


/* WARNING: Removing unreachable block (ram,0x0001cc7a) */
/* WARNING: Removing unreachable block (ram,0x0001cc82) */
/* WARNING: Removing unreachable block (ram,0x0001cd1e) */

int * FUN_0001c660(undefined4 *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  byte bVar1;
  char cVar2;
  byte *pbVar3;
  int iVar4;
  int *piVar5;
  size_t sVar6;
  uint uVar7;
  int iVar8;
  byte *pbVar9;
  int iVar10;
  char *pcVar11;
  undefined1 *puVar12;
  byte *pbVar13;
  uint uVar14;
  char *pcVar15;
  undefined1 *puVar16;
  uint uVar17;
  int unaff_r6;
  
  pbVar3 = (byte *)*param_1;
  pbVar13 = (byte *)param_1[1];
  uVar7 = (int)pbVar13 - (int)pbVar3;
  if (pbVar13 == pbVar3) goto switchD_0001c684_caseD_42;
  bVar1 = *pbVar3;
  switch(bVar1) {
  case 0x41:
    pbVar9 = pbVar3 + 1;
    *param_1 = pbVar9;
    if (pbVar13 == pbVar9) {
LAB_0001cc84:
      iVar8 = FUN_0001eb18(param_1);
      if (((iVar8 == 0) || (pcVar11 = (char *)*param_1, pcVar11 == (char *)param_1[1])) ||
         (*pcVar11 != '_')) goto LAB_0001cd10;
LAB_0001ccd8:
      pbVar3 = (byte *)(pcVar11 + 1);
    }
    else {
      if (0xfffffff5 < *pbVar9 - 0x3a) {
        piVar5 = (int *)0x0;
        FUN_0001c5c0(&stack0xffffffd8,param_1,0);
        iVar8 = FUN_0001e86c(param_1,&stack0xffffffd8);
        pcVar11 = (char *)*param_1;
        if ((pcVar11 == (char *)param_1[1]) || (*pcVar11 != '_')) goto LAB_0001ca38;
        goto LAB_0001ccd8;
      }
      if (*pbVar9 != 0x5f) goto LAB_0001cc84;
      pbVar3 = pbVar3 + 2;
      iVar8 = 0;
    }
    *param_1 = pbVar3;
    iVar4 = FUN_0001c660(param_1);
    if (iVar4 != 0) {
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      FUN_0001e9c0(piVar5,0xf,0,0,1);
      piVar5[2] = iVar4;
      piVar5[3] = iVar8;
      iVar8 = DAT_0001cf18 + 0x1cd0c;
LAB_0001cd0a:
      *piVar5 = iVar8 + 8;
      goto LAB_0001ca38;
    }
    goto LAB_0001cd10;
  default:
    goto switchD_0001c684_caseD_42;
  case 0x43:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
    if (iVar8 == 0) {
      return (int *)0x0;
    }
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    *(undefined1 *)(piVar5 + 1) = 5;
    iVar4 = 8;
    iVar10 = DAT_0001cb34 + 0x1c906;
    goto LAB_0001c92e;
  case 0x44:
    if (uVar7 < 2) {
      return (int *)0x0;
    }
    bVar1 = pbVar3[1];
    piVar5 = (int *)0x0;
    switch(bVar1) {
    case 0x41:
      if (uVar7 != 2) {
        bVar1 = pbVar3[2];
        *param_1 = pbVar3 + 3;
        switch(bVar1) {
        case 0x69:
          pcVar11 = (char *)(DAT_0001d250 + 0x1cf7c);
          break;
        case 0x6a:
          iVar8 = DAT_0001d254 + 0x1d170;
          goto LAB_0001cf96;
        default:
          return (int *)0x0;
        case 0x6c:
          pcVar11 = (char *)(DAT_0001d258 + 0x1d164);
          goto LAB_0001cc22;
        case 0x6d:
          pcVar11 = (char *)(DAT_0001d25c + 0x1d176);
LAB_0001d1a0:
          piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
          sVar6 = strlen(pcVar11);
          piVar5[2] = (int)pcVar11;
          piVar5[3] = sVar6;
          *(undefined1 *)(piVar5 + 1) = 8;
          *piVar5 = DAT_000231f0 + 0x231e2;
          *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
          return piVar5;
        case 0x73:
          pcVar11 = (char *)(DAT_0001d248 + 0x1d17c);
          goto LAB_0001cb78;
        case 0x74:
          iVar8 = DAT_0001d24c + 0x1d16a;
LAB_0001d186:
          piVar5 = (int *)FUN_0001de04(param_1,iVar8);
          return piVar5;
        }
        goto LAB_0001c854;
      }
      goto LAB_0001cfca;
    case 0x42:
    case 0x55:
      pbVar3 = pbVar3 + 2;
      *param_1 = pbVar3;
      if ((pbVar13 == pbVar3) || (*pbVar3 - 0x3a < 0xfffffff6)) {
        iVar8 = FUN_0001eb18(param_1);
        if (iVar8 == 0) {
          return (int *)0x0;
        }
      }
      else {
        FUN_0001c5c0(&stack0xffffffd8,param_1,0);
        iVar8 = FUN_0001e86c(param_1,&stack0xffffffd8);
      }
      pcVar11 = (char *)*param_1;
      if (pcVar11 == (char *)param_1[1]) {
        return (int *)0x0;
      }
      if (*pcVar11 != '_') {
        return (int *)0x0;
      }
      *param_1 = pcVar11 + 1;
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      *(undefined1 *)(piVar5 + 1) = 0x20;
      *(bool *)(piVar5 + 3) = bVar1 == 0x42;
      piVar5[2] = iVar8;
      iVar8 = DAT_0001d2a4 + 0x1d034;
      break;
    default:
      return (int *)0x0;
    case 0x46:
      *param_1 = pbVar3 + 2;
      iVar8 = FUN_0001bec0(param_1,DAT_0001d23c + 0x1cf8c,3);
      if (iVar8 != 0) {
        iVar8 = DAT_0001d240 + 0x1cf98;
LAB_0001cf96:
        piVar5 = (int *)FUN_00021264(param_1,iVar8);
        return piVar5;
      }
      FUN_0001c5c0(&stack0xffffffd8,param_1,0);
      iVar8 = FUN_0001e86c(param_1,&stack0xffffffd8);
      pcVar11 = (char *)*param_1;
      if (pcVar11 == (char *)param_1[1]) {
        return (int *)0x0;
      }
      if (*pcVar11 != '_') {
        return (int *)0x0;
      }
      *param_1 = pcVar11 + 1;
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
      *(undefined1 *)(piVar5 + 1) = 0x1f;
      piVar5[2] = iVar8;
      iVar8 = DAT_0001d244 + 0x1d082;
      break;
    case 0x4b:
    case 0x6b:
      *param_1 = pbVar3 + 2;
      iVar8 = FUN_0001d34c(param_1,0);
      if (iVar8 == 0) {
        return (int *)0x0;
      }
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
      *(undefined1 *)(piVar5 + 1) = 5;
      iVar4 = 0xf;
      iVar10 = DAT_0001cf20 + 0x1cd86;
      if (bVar1 == 0x6b) {
        iVar4 = 5;
        iVar10 = DAT_0001cf1c + 0x1cd84;
      }
      piVar5[2] = iVar8;
      piVar5[3] = iVar10;
      piVar5[4] = iVar4;
      iVar8 = DAT_0001cf24 + 0x1cd94;
      break;
    case 0x4f:
    case 0x6f:
    case 0x77:
    case 0x78:
      goto switchD_0001c684_caseD_46;
    case 0x52:
      if (uVar7 != 2) {
        bVar1 = pbVar3[2];
        *param_1 = pbVar3 + 3;
        switch(bVar1) {
        case 0x69:
          pcVar11 = (char *)(DAT_0001d268 + 0x1d0aa);
          break;
        case 0x6a:
          iVar8 = DAT_0001d26c + 0x1d19c;
          goto LAB_0001cf96;
        case 0x6b:
        case 0x6e:
        case 0x6f:
        case 0x70:
        case 0x71:
        case 0x72:
          return (int *)0x0;
        case 0x6c:
          pcVar11 = (char *)(DAT_0001d270 + 0x1d182);
          goto LAB_0001cc22;
        case 0x6d:
          pcVar11 = (char *)(DAT_0001d274 + 0x1d1a2);
          goto LAB_0001d1a0;
        case 0x73:
          pcVar11 = (char *)(DAT_0001d260 + 0x1d1b6);
          goto LAB_0001cb78;
        case 0x74:
          iVar8 = DAT_0001d264 + 0x1d188;
          goto LAB_0001d186;
        default:
          return (int *)0x0;
        }
        goto LAB_0001c854;
      }
LAB_0001cfca:
      pbVar3 = pbVar3 + 3;
LAB_0001cfcc:
      *param_1 = pbVar3;
      return (int *)0x0;
    case 0x53:
      pbVar9 = pbVar3 + 2;
      *param_1 = pbVar9;
      if (pbVar13 == pbVar9) {
        return (int *)0x0;
      }
      uVar7 = (int)pbVar13 - (int)pbVar9;
      if (uVar7 < 2) {
        return (int *)0x0;
      }
      if (*pbVar9 != 0x44) {
        return (int *)0x0;
      }
      if (pbVar3[3] == 0x52) {
        if (2 < uVar7) {
          bVar1 = pbVar3[4];
          *param_1 = pbVar3 + 5;
          switch(bVar1) {
          case 0x69:
            pcVar11 = (char *)(DAT_0001d294 + 0x1d0d6);
            break;
          case 0x6a:
            pcVar11 = (char *)(DAT_0001d298 + 0x1d20a);
            goto LAB_0001d1a0;
          case 0x6b:
          case 0x6e:
          case 0x6f:
          case 0x70:
          case 0x71:
          case 0x72:
            return (int *)0x0;
          case 0x6c:
            pcVar11 = (char *)(DAT_0001d29c + 0x1d1dc);
            goto LAB_0001d1da;
          case 0x6d:
            pcVar11 = (char *)(DAT_0001d2a0 + 0x1d21e);
            goto LAB_0001d21c;
          case 0x73:
            pcVar11 = (char *)(DAT_0001d28c + 0x1d232);
            goto LAB_0001c8b4;
          case 0x74:
            pcVar11 = (char *)(DAT_0001d290 + 0x1d1f0);
            goto LAB_0001d1ee;
          default:
            return (int *)0x0;
          }
          goto LAB_0001cc22;
        }
      }
      else {
        if (pbVar3[3] != 0x41) {
          return (int *)0x0;
        }
        if (2 < uVar7) {
          bVar1 = pbVar3[4];
          *param_1 = pbVar3 + 5;
          switch(bVar1) {
          case 0x69:
            pcVar11 = (char *)(DAT_0001cf3c + 0x1cee8);
            break;
          case 0x6a:
            pcVar11 = (char *)(DAT_0001d280 + 0x1d204);
            goto LAB_0001d1a0;
          default:
            return (int *)0x0;
          case 0x6c:
            pcVar11 = (char *)(DAT_0001d284 + 0x1d1d0);
LAB_0001d1da:
            piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
            sVar6 = strlen(pcVar11);
            piVar5[2] = (int)pcVar11;
            piVar5[3] = sVar6;
            *(undefined1 *)(piVar5 + 1) = 8;
            *piVar5 = DAT_00023270 + 0x23262;
            *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
            return piVar5;
          case 0x6d:
            pcVar11 = (char *)(DAT_0001d288 + 0x1d210);
LAB_0001d21c:
            piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
            sVar6 = strlen(pcVar11);
            piVar5[2] = (int)pcVar11;
            piVar5[3] = sVar6;
            *(undefined1 *)(piVar5 + 1) = 8;
            *piVar5 = DAT_000232b0 + 0x232a2;
            *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
            return piVar5;
          case 0x73:
            pcVar11 = (char *)(DAT_0001d278 + 0x1d216);
            goto LAB_0001c8b4;
          case 0x74:
            pcVar11 = (char *)(DAT_0001d27c + 0x1d1d6);
LAB_0001d1ee:
            piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
            sVar6 = strlen(pcVar11);
            piVar5[2] = (int)pcVar11;
            piVar5[3] = sVar6;
            *(undefined1 *)(piVar5 + 1) = 8;
            *piVar5 = DAT_00023230 + 0x23222;
            *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
            return piVar5;
          }
          goto LAB_0001cc22;
        }
      }
      pbVar3 = pbVar3 + 5;
      goto LAB_0001cfcc;
    case 0x54:
    case 0x74:
      piVar5 = (int *)FUN_0001e3d8(param_1);
      goto LAB_0001ca38;
    case 0x61:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001d2ac + 0x1cfb0;
      goto LAB_0001cc3a;
    case 99:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001d2b0 + 0x1cfba;
      goto LAB_0001cb90;
    case 100:
      *param_1 = pbVar3 + 2;
      pcVar11 = (char *)(DAT_0001d234 + 0x1cfda);
      goto LAB_0001cc0a;
    case 0x65:
      *param_1 = pbVar3 + 2;
      pcVar11 = (char *)(DAT_0001d238 + 0x1cfc4);
      goto LAB_0001c86c;
    case 0x66:
      *param_1 = pbVar3 + 2;
      pcVar11 = (char *)(DAT_0001cf28 + 0x1cdc2);
LAB_0001cc0a:
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      sVar6 = strlen(pcVar11);
      piVar5[2] = (int)pcVar11;
      piVar5[3] = sVar6;
      *(undefined1 *)(piVar5 + 1) = 8;
      *piVar5 = DAT_000230b0 + 0x230a2;
      *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
      return piVar5;
    case 0x68:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001cf40 + 0x1cef2;
      goto LAB_0001cc3a;
    case 0x69:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001d2a8 + 0x1cfe4;
      goto LAB_0001c7be;
    case 0x6e:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001cf2c + 0x1cdcc;
LAB_0001cb90:
      piVar5 = (int *)FUN_0002275c(param_1,iVar8);
      return piVar5;
    case 0x70:
      *param_1 = pbVar3 + 2;
      iVar8 = FUN_0001c660(param_1);
      if (iVar8 == 0) {
        return (int *)0x0;
      }
      piVar5 = (int *)FUN_00020214(param_1,&stack0xffffffd8);
      goto LAB_0001ca40;
    case 0x73:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001cf38 + 0x1ce6c;
LAB_0001c7be:
      piVar5 = (int *)FUN_000230b4(param_1,iVar8);
      return piVar5;
    case 0x75:
      *param_1 = pbVar3 + 2;
      pcVar11 = (char *)((int)&DAT_0001cefc + DAT_0001cf44);
      goto LAB_0001c83c;
    case 0x76:
      iVar8 = FUN_0001bec0(param_1,DAT_0001cf30 + 0x1cdd6,2);
      if (iVar8 != 0) {
        pbVar3 = (byte *)*param_1;
        if (((byte *)param_1[1] == pbVar3) || (bVar1 = *pbVar3, bVar1 < 0x31)) {
LAB_0001d11e:
          iVar8 = FUN_0001eb18(param_1);
          if (((iVar8 != 0) && (pcVar11 = (char *)*param_1, pcVar11 != (char *)param_1[1])) &&
             (*pcVar11 == '_')) {
            *param_1 = pcVar11 + 1;
            iVar8 = FUN_0001c660(param_1);
            if (iVar8 != 0) {
              puVar12 = &stack0xffffffd4;
              puVar16 = &stack0xffffffd8;
LAB_0001d154:
              piVar5 = (int *)FUN_00023768(param_1,puVar12,puVar16);
            }
          }
        }
        else if (bVar1 < 0x3a) {
          FUN_0001c5c0(&stack0xffffffd8,param_1,0);
          iVar8 = FUN_0001e86c(param_1,&stack0xffffffd8);
          pcVar11 = (char *)*param_1;
          if ((pcVar11 != (char *)param_1[1]) && (*pcVar11 == '_')) {
            pcVar15 = pcVar11 + 1;
            *param_1 = pcVar15;
            if ((pcVar15 == (char *)param_1[1]) || (*pcVar15 != 'p')) {
              iVar8 = FUN_0001c660(param_1);
              if (iVar8 != 0) {
                puVar12 = &stack0xffffffd8;
                puVar16 = &stack0xffffffd4;
                goto LAB_0001d154;
              }
            }
            else {
              *param_1 = pcVar11 + 2;
              piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
              *(undefined1 *)(piVar5 + 1) = 0x1e;
              piVar5[2] = iVar8;
              *piVar5 = DAT_0001cf34 + 0x1ce56;
              *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
            }
          }
        }
        else {
          if (bVar1 != 0x5f) goto LAB_0001d11e;
          *param_1 = pbVar3 + 1;
          iVar8 = FUN_0001c660(param_1);
          if (iVar8 != 0) {
            piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
            piVar5[2] = iVar8;
            piVar5[3] = 0;
            *(undefined1 *)(piVar5 + 1) = 0x1d;
            *piVar5 = DAT_0001d2b4 + 0x1d110;
            *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
          }
        }
      }
      goto LAB_0001ca38;
    }
LAB_0001c78a:
    *piVar5 = iVar8 + 8;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x46:
switchD_0001c684_caseD_46:
    piVar5 = (int *)FUN_00022c1c(param_1);
    goto LAB_0001ca38;
  case 0x47:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
    if (iVar8 == 0) {
      return (int *)0x0;
    }
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    *(undefined1 *)(piVar5 + 1) = 5;
    iVar4 = 10;
    iVar10 = DAT_0001cb38 + 0x1c930;
LAB_0001c92e:
    piVar5[2] = iVar8;
    piVar5[3] = iVar10;
    piVar5[4] = iVar4;
    *piVar5 = DAT_0001cb3c + 0x1c942;
LAB_0001c93c:
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    goto LAB_0001ca40;
  case 0x4b:
  case 0x56:
  case 0x72:
    uVar17 = (uint)(bVar1 == 0x72);
    if (uVar17 < uVar7) {
      uVar14 = 1;
      if (bVar1 == 0x72) {
        uVar14 = 2;
      }
      if (pbVar3[uVar17] != 0x56) {
        uVar14 = uVar17;
      }
      if ((uVar14 < uVar7) && (pbVar3[uVar14] == 0x4b)) {
        uVar14 = uVar14 + 1;
      }
      if (uVar14 < uVar7) {
        if (pbVar3[uVar14] == 0x46) goto switchD_0001c684_caseD_46;
        if ((pbVar3[uVar14] == 0x44) && (uVar14 + 1 < uVar7)) {
          uVar7 = pbVar3[uVar14 + 1] - 0x6f;
          if (((uVar7 < 10) && ((1 << (uVar7 & 0xff) & 0x301U) != 0)) ||
             (pbVar3[uVar14 + 1] == 0x4f)) goto switchD_0001c684_caseD_46;
        }
      }
    }
  case 0x55:
    piVar5 = (int *)FUN_00022e58(param_1);
    goto LAB_0001ca38;
  case 0x4d:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
    if ((iVar8 != 0) && (iVar4 = FUN_0001c660(param_1), iVar4 != 0)) {
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      FUN_0001e9c0(piVar5,0xe,*(byte *)(iVar4 + 5) >> 6,1,1);
      piVar5[2] = iVar8;
      piVar5[3] = iVar4;
      iVar8 = DAT_0001cb40 + 0x1c998;
      goto LAB_0001cd0a;
    }
LAB_0001cd10:
    piVar5 = (int *)0x0;
    goto LAB_0001ca38;
  case 0x4f:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
    goto joined_r0x0001cbae;
  case 0x50:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
    if (iVar8 == 0) {
      return (int *)0x0;
    }
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
    FUN_0001e9c0(piVar5,0xc,*(byte *)(iVar8 + 5) >> 6,1,1);
    piVar5[2] = iVar8;
    *piVar5 = DAT_0001cf08 + 0x1cc06;
    goto LAB_0001ca40;
  case 0x52:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
joined_r0x0001cbae:
    if (iVar8 == 0) {
      return (int *)0x0;
    }
    piVar5 = (int *)FUN_00023378(param_1,&stack0xffffffd8,&stack0xffffffd4);
    goto LAB_0001ca40;
  case 0x53:
    if ((uVar7 < 2) || (pbVar3[1] != 0x74)) {
      piVar5 = (int *)FUN_0001defc(param_1,0,&stack0xffffffd4);
      if (piVar5 == (int *)0x0) {
        return (int *)0x0;
      }
      if ((char *)param_1[1] == (char *)*param_1) goto LAB_0001ca40;
      cVar2 = *(char *)*param_1;
joined_r0x0001c824:
      if (cVar2 == 'I') {
        FUN_0001d7c0(param_1 + 0x25,&stack0xffffffd0);
        iVar8 = FUN_0001df74(param_1,0);
        if (iVar8 == 0) {
          return (int *)0x0;
        }
        piVar5 = (int *)FUN_0001e168(param_1,&stack0xffffffd0,&stack0xffffffd8);
      }
      goto LAB_0001ca40;
    }
    goto switchD_0001c684_caseD_42;
  case 0x54:
    if (((uVar7 < 2) || (0x10 < pbVar3[1] - 0x65)) ||
       ((1 << (pbVar3[1] - 0x65 & 0xff) & DAT_0001cb14) == 0)) {
      piVar5 = (int *)FUN_0001e1e8(param_1);
      if (piVar5 == (int *)0x0) {
        return (int *)0x0;
      }
      if ((*(char *)(param_1 + 0x61) != '\x01') || ((char *)param_1[1] == (char *)*param_1))
      goto LAB_0001ca40;
      cVar2 = *(char *)*param_1;
      goto joined_r0x0001c824;
    }
switchD_0001c684_caseD_42:
    piVar5 = (int *)FUN_000232b4(param_1);
LAB_0001ca38:
    if (piVar5 == (int *)0x0) {
      return (int *)0x0;
    }
LAB_0001ca40:
    FUN_0001d7c0(param_1 + 0x25,&stack0xffffffd0);
    return piVar5;
  case 0x61:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cf10 + 0x1cc24);
    goto LAB_0001cc22;
  case 0x62:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb18 + 0x1c834;
    break;
  case 99:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cf14 + 0x1cc3c;
    break;
  case 100:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb20 + 0x1c856);
LAB_0001c854:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00023170 + 0x23162;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x65:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cefc + 0x1cb70);
LAB_0001cc22:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00022ff0 + 0x22fe2;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x66:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb10 + 0x1c7e2;
    goto LAB_0001c9a0;
  case 0x67:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb24 + 0x1c86e);
LAB_0001c86c:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_000231b0 + 0x231a2;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x68:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb4c + 0x1caf2);
    goto LAB_0001caf0;
  case 0x69:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb30 + 0x1c8ce;
    goto LAB_0001c8cc;
  case 0x6a:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cf00 + 0x1cb7a);
LAB_0001cb78:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00023070 + 0x23062;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x6c:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb28 + 0x1c8ac;
    break;
  case 0x6d:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb0c + 0x1c7d8);
LAB_0001caf0:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00023030 + 0x23022;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x6e:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb08 + 0x1c7c0;
    goto LAB_0001c7be;
  case 0x6f:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb2c + 0x1c8b6);
LAB_0001c8b4:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00023130 + 0x23122;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x73:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb44 + 0x1c9a2;
LAB_0001c9a0:
    piVar5 = (int *)FUN_00020274(param_1,iVar8);
    return piVar5;
  case 0x74:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cf04 + 0x1cb92;
    goto LAB_0001cb90;
  case 0x75:
    *param_1 = pbVar3 + 1;
    FUN_000224c2(&stack0xffffffd8,param_1);
    if (&stack0xfffffff8 == (undefined1 *)0x0) {
      return (int *)0x0;
    }
    pcVar11 = (char *)*param_1;
    if ((pcVar11 == (char *)param_1[1]) || (*pcVar11 != 'I')) {
      piVar5 = (int *)FUN_0001de44(param_1,&stack0xffffffd8);
      goto LAB_0001ca40;
    }
    *param_1 = pcVar11 + 1;
    iVar8 = FUN_0001c660(param_1);
    if (iVar8 == 0) {
      return (int *)0x0;
    }
    pcVar11 = (char *)*param_1;
    if (pcVar11 == (char *)param_1[1]) {
      return (int *)0x0;
    }
    if (*pcVar11 != 'E') {
      return (int *)0x0;
    }
    *param_1 = pcVar11 + 1;
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    *(undefined1 *)(piVar5 + 1) = 7;
    *piVar5 = DAT_0001cb48 + 0x1ca20;
    piVar5[2] = unaff_r6;
    piVar5[3] = (int)&stack0xfffffff8;
    piVar5[4] = iVar8;
    goto LAB_0001c93c;
  case 0x76:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb00 + 0x1c7ac;
    break;
  case 0x77:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb1c + 0x1c83e);
LAB_0001c83c:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00020988 + 0x2097a;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x78:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cf0c + 0x1cc0c);
    goto LAB_0001cc0a;
  case 0x79:
    *param_1 = pbVar3 + 1;
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10,pbVar13,bVar1,param_3,param_4);
    *(undefined1 *)(piVar5 + 1) = 8;
    piVar5[2] = DAT_0001cae0 + 0x1c784;
    piVar5[3] = 0x12;
    iVar8 = DAT_0001cae4 + 0x1c78c;
    goto LAB_0001c78a;
  case 0x7a:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb04 + 0x1c7b6;
LAB_0001c8cc:
    piVar5 = (int *)FUN_0001e454(param_1,iVar8);
    return piVar5;
  }
LAB_0001cc3a:
  piVar5 = (int *)FUN_0001e94c(param_1,iVar8);
  return piVar5;
}




// ============================================================
// Function #147
// Name: FUN_0001d2b8
// Address: 0001d2b8
// JNI: NO
// ============================================================


void FUN_0001d2b8(undefined4 param_1,uint param_2,undefined4 param_3,uint param_4)

{
  if (param_4 <= param_2) {
    FUN_0001d2ce(param_1,param_4);
    return;
  }
  return;
}




// ============================================================
// Function #148
// Name: FUN_0001d2ce
// Address: 0001d2ce
// JNI: NO
// ============================================================


bool FUN_0001d2ce(undefined4 param_1,int param_2,undefined4 param_3,int param_4)

{
  int iVar1;
  
  if (param_2 == param_4) {
    iVar1 = FUN_0001a5a8(&stack0xfffffff0,param_3,param_4);
    return iVar1 == 0;
  }
  return false;
}




// ============================================================
// Function #149
// Name: FUN_0001d2f0
// Address: 0001d2f0
// JNI: NO
// ============================================================


int * FUN_0001d2f0(int *param_1,int param_2)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  int iVar4;
  int *piVar5;
  int *piVar6;
  
  piVar5 = param_1 + 4;
  iVar4 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  iVar1 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  iVar2 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  piVar3 = param_1 + 0xb;
  *param_1 = param_2;
  param_1[9] = (int)piVar3;
  *piVar5 = 0;
  param_1[5] = iVar4;
  param_1[6] = iVar1;
  param_1[7] = iVar2;
  piVar6 = param_1 + 8;
  *piVar6 = (int)piVar3;
  *piVar3 = 0;
  param_1[0xc] = iVar4;
  param_1[0xd] = iVar1;
  param_1[0xe] = iVar2;
  param_1[0xf] = 0;
  param_1[0x10] = iVar4;
  param_1[0x11] = iVar1;
  param_1[0x12] = iVar2;
  param_1[10] = (int)(param_1 + 0x13);
  param_1[1] = (int)piVar5;
  param_1[2] = (int)piVar5;
  param_1[3] = (int)piVar6;
  FUN_0001d928(param_1 + 1,param_2 + 0x14c);
  FUN_0001d9b6(piVar6,*param_1 + 0x120);
  iVar4 = *param_1;
  *(undefined4 *)(iVar4 + 0x150) = *(undefined4 *)(iVar4 + 0x14c);
  *(undefined4 *)(iVar4 + 0x124) = *(undefined4 *)(iVar4 + 0x120);
  return param_1;
}




// ============================================================
// Function #150
// Name: FUN_0001d34c
// Address: 0001d34c
// JNI: NO
// ============================================================


int FUN_0001d34c(undefined4 *param_1,int param_2)

{
  char cVar1;
  char *pcVar2;
  undefined4 uVar3;
  char *pcVar4;
  undefined1 uVar5;
  char *pcVar6;
  int iVar7;
  int iVar8;
  int local_7c [2];
  int local_74 [19];
  uint local_28;
  
  pcVar4 = (char *)*param_1;
  pcVar2 = (char *)param_1[1];
  if (pcVar2 == pcVar4) {
LAB_0001d38a:
    local_28 = local_28 & 0xffffff00;
    local_74[0] = FUN_0001defc(param_1,param_2,&local_28);
    if (local_74[0] != 0) {
      if (((char *)param_1[1] == (char *)*param_1) || (*(char *)*param_1 != 'I')) {
        if ((char)local_28 != '\0') {
          return 0;
        }
        return local_74[0];
      }
      if ((char)local_28 == '\0') {
        FUN_0001d7c0(param_1 + 0x25,local_74);
      }
      local_7c[0] = FUN_0001df74(param_1,param_2 != 0);
      if (local_7c[0] != 0) {
        if (param_2 != 0) {
          *(undefined1 *)(param_2 + 1) = 1;
        }
        iVar7 = FUN_0001e168(param_1,local_74,local_7c);
        return iVar7;
      }
    }
    return 0;
  }
  pcVar6 = pcVar4 + 1;
  if (*pcVar4 == 'Z') {
    *param_1 = pcVar6;
    local_28 = FUN_0001bef4(param_1);
    if (local_28 == 0) {
      return 0;
    }
    pcVar2 = (char *)*param_1;
    if (pcVar2 == (char *)param_1[1]) {
      return 0;
    }
    if (*pcVar2 != 'E') {
      return 0;
    }
    pcVar4 = pcVar2 + 1;
    *param_1 = pcVar4;
    if ((pcVar4 != (char *)param_1[1]) && (*pcVar4 == 's')) {
      *param_1 = pcVar2 + 2;
      uVar3 = FUN_000226f6();
      *param_1 = uVar3;
      local_74[0] = FUN_0002275c(param_1,DAT_0001d63c + 0x1d43e);
      iVar7 = FUN_0002279c(param_1,&local_28,local_74);
      return iVar7;
    }
    FUN_0001d2f0(local_74,param_1);
    pcVar2 = (char *)*param_1;
    if ((pcVar2 == (char *)param_1[1]) || (*pcVar2 != 'd')) {
      local_7c[0] = FUN_0001d34c(param_1,param_2);
      if (local_7c[0] != 0) {
        uVar3 = FUN_000226f6(*param_1,param_1[1]);
        *param_1 = uVar3;
LAB_0001d612:
        iVar7 = FUN_0002279c(param_1,&local_28,local_7c);
        goto LAB_0001d622;
      }
    }
    else {
      *param_1 = pcVar2 + 1;
      FUN_0001c5c0(local_7c,param_1,1);
      pcVar2 = (char *)*param_1;
      if ((pcVar2 != (char *)param_1[1]) && (*pcVar2 == '_')) {
        *param_1 = pcVar2 + 1;
        local_7c[0] = FUN_0001d34c(param_1,param_2);
        if (local_7c[0] != 0) goto LAB_0001d612;
      }
    }
    iVar7 = 0;
LAB_0001d622:
    FUN_0001d8ec(local_74);
    return iVar7;
  }
  if (*pcVar4 != 'N') goto LAB_0001d38a;
  *param_1 = pcVar6;
  if ((pcVar6 == pcVar2) || (*pcVar6 != 'H')) {
    uVar3 = FUN_0001e1a4(param_1);
    if (param_2 != 0) {
      *(undefined4 *)(param_2 + 4) = uVar3;
    }
    pcVar4 = (char *)*param_1;
    pcVar2 = (char *)param_1[1];
    if (pcVar4 == pcVar2) {
LAB_0001d482:
      if (param_2 == 0) goto LAB_0001d490;
      uVar5 = 0;
      iVar7 = 8;
    }
    else {
      pcVar6 = pcVar4 + 1;
      if (*pcVar4 == 'O') {
        *param_1 = pcVar6;
        pcVar4 = pcVar6;
        if (param_2 == 0) goto LAB_0001d490;
        uVar5 = 2;
      }
      else {
        if (*pcVar4 != 'R') goto LAB_0001d482;
        *param_1 = pcVar6;
        pcVar4 = pcVar6;
        if (param_2 == 0) goto LAB_0001d490;
        uVar5 = 1;
      }
      iVar7 = 8;
      pcVar4 = pcVar6;
    }
  }
  else {
    pcVar4 = pcVar4 + 2;
    *param_1 = pcVar4;
    if (param_2 == 0) goto LAB_0001d490;
    uVar5 = 1;
    iVar7 = 0x10;
  }
  *(undefined1 *)(param_2 + iVar7) = uVar5;
LAB_0001d490:
  local_74[0] = 0;
  iVar7 = 0;
LAB_0001d4a6:
  do {
    if ((pcVar4 != pcVar2) && (*pcVar4 == 'E')) {
      *param_1 = pcVar4 + 1;
      if (iVar7 == 0) {
        return 0;
      }
      if (param_1[0x25] == param_1[0x26]) {
        return 0;
      }
      param_1[0x26] = param_1[0x26] + -4;
      return iVar7;
    }
    if (param_2 != 0) {
      *(undefined1 *)(param_2 + 1) = 0;
    }
    if (pcVar2 == pcVar4) {
LAB_0001d542:
      iVar8 = 0;
LAB_0001d544:
      iVar7 = FUN_0001e5ac(param_1,param_2,iVar7,iVar8);
LAB_0001d54e:
      if (iVar7 == 0) {
        return 0;
      }
    }
    else {
      cVar1 = *pcVar4;
      if (cVar1 == 'D') {
        if (((uint)((int)pcVar2 - (int)pcVar4) < 2) || ((byte)(pcVar4[1] | 0x20U) != 0x74))
        goto LAB_0001d542;
        if (iVar7 != 0) {
          return 0;
        }
        iVar7 = FUN_0001e3d8(param_1);
        goto LAB_0001d54e;
      }
      if (cVar1 != 'I') {
        if (cVar1 != 'S') {
          if (cVar1 != 'T') goto LAB_0001d542;
          if (iVar7 != 0) {
            return 0;
          }
          iVar7 = FUN_0001e1e8(param_1);
          goto LAB_0001d54e;
        }
        if (((uint)((int)pcVar2 - (int)pcVar4) < 2) || (pcVar4[1] != 't')) {
          iVar8 = FUN_0001e494(param_1);
          if (iVar8 == 0) {
            return 0;
          }
        }
        else {
          *param_1 = pcVar4 + 2;
          iVar8 = FUN_0001e454(param_1,DAT_0001d638 + 0x1d524);
        }
        if (*(char *)(iVar8 + 4) == '\x1b') goto LAB_0001d544;
        if (iVar7 != 0) {
          return 0;
        }
        pcVar4 = (char *)*param_1;
        pcVar2 = (char *)param_1[1];
        iVar7 = iVar8;
        local_74[0] = iVar8;
        goto LAB_0001d4a6;
      }
      if (iVar7 == 0) {
        return 0;
      }
      local_7c[0] = FUN_0001df74(param_1,param_2 != 0);
      if (local_7c[0] == 0) {
        return 0;
      }
      if (*(char *)(iVar7 + 4) == '-') {
        return 0;
      }
      if (param_2 != 0) {
        *(undefined1 *)(param_2 + 1) = 1;
      }
      iVar7 = FUN_0001e168(param_1,local_74,local_7c);
    }
    local_74[0] = iVar7;
    FUN_0001d7c0(param_1 + 0x25,local_74);
    pcVar4 = (char *)*param_1;
    pcVar6 = (char *)param_1[1];
    pcVar2 = pcVar4;
    if ((pcVar4 != pcVar6) && (pcVar2 = pcVar6, *pcVar4 == 'M')) {
      pcVar4 = pcVar4 + 1;
      *param_1 = pcVar4;
    }
  } while( true );
}




// ============================================================
// Function #151
// Name: FUN_0001d640
// Address: 0001d640
// JNI: NO
// ============================================================


bool FUN_0001d640(undefined4 *param_1)

{
  char cVar1;
  char *pcVar2;
  
  pcVar2 = *(char **)*param_1;
  if ((char *)((undefined4 *)*param_1)[1] == pcVar2) {
    return true;
  }
  cVar1 = *pcVar2;
  if (cVar1 == '.' || cVar1 == 'E') {
    return true;
  }
  return cVar1 == '_';
}




// ============================================================
// Function #152
// Name: FUN_0001d668
// Address: 0001d668
// JNI: NO
// ============================================================


/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int * FUN_0001d668(undefined8 *param_1)

{
  byte *pbVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  char *pcVar5;
  size_t sVar6;
  byte *pbVar7;
  char *pcVar8;
  undefined *puVar9;
  uint uVar10;
  char *pcVar11;
  char *pcVar12;
  bool bVar13;
  bool bVar14;
  undefined8 uVar15;
  int local_24;
  int iStack_20;
  int local_1c;
  
  pbVar7 = *(byte **)param_1;
  pbVar1 = *(byte **)((int)param_1 + 4);
  if (pbVar1 == pbVar7) {
    uVar10 = 0xffffffb6;
  }
  else {
    uVar10 = *pbVar7 - 0x4a;
  }
  switch(uVar10 >> 1 | uVar10 << 0x1f) {
  case 0:
    iVar3 = *(int *)((int)param_1 + 0xc);
    iVar2 = *(int *)(param_1 + 1);
    pbVar7 = pbVar7 + 1;
    *(byte **)param_1 = pbVar7;
    while ((pbVar7 == pbVar1 || (*pbVar7 != 0x45))) {
      local_1c = FUN_0001d668(param_1);
      if (local_1c == 0) {
        return (int *)0x0;
      }
      FUN_0001d7c0(param_1 + 1,&local_1c);
      pbVar1 = *(byte **)((int)param_1 + 4);
      pbVar7 = *(byte **)param_1;
    }
    *(byte **)param_1 = pbVar7 + 1;
    FUN_0001d830(&local_24,param_1,iVar3 - iVar2 >> 2);
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x29;
    *piVar4 = DAT_0001d7b8 + 0x1d79c;
    piVar4[2] = local_24;
    piVar4[3] = iStack_20;
    goto LAB_0001d79e;
  case 1:
    if ((1 < (uint)((int)pbVar1 - (int)pbVar7)) && (pbVar7[1] == 0x5a)) {
      *(byte **)param_1 = pbVar7 + 2;
      piVar4 = (int *)FUN_0001bef4(param_1);
      goto LAB_0001d744;
    }
    pcVar5 = *(char **)param_1;
    pcVar8 = *(char **)((int)param_1 + 4);
    if (pcVar5 == pcVar8) {
      return (int *)0x0;
    }
    if (*pcVar5 != 'L') {
      return (int *)0x0;
    }
    pcVar11 = pcVar5 + 1;
    *(char **)param_1 = pcVar11;
    if (pcVar8 == pcVar11) {
LAB_0001fcb6:
      iVar2 = FUN_0001c660(param_1);
      if (iVar2 == 0) {
        return (int *)0x0;
      }
      uVar15 = FUN_0001c5c0(&iStack_20,param_1,1);
      if (local_1c != 0) {
        uVar15 = *param_1;
      }
      pcVar5 = (char *)uVar15;
      if (local_1c == 0 || pcVar5 == (char *)((ulonglong)uVar15 >> 0x20)) {
        return (int *)0x0;
      }
      if (*pcVar5 != 'E') {
        return (int *)0x0;
      }
      *(char **)param_1 = pcVar5 + 1;
      piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x14);
      *(undefined1 *)(piVar4 + 1) = 0x4c;
      iVar3 = DAT_00020074;
      piVar4[4] = local_1c;
      *piVar4 = iVar3 + 0x1fd14;
      piVar4[2] = iVar2;
      piVar4[3] = iStack_20;
      goto LAB_00020000;
    }
    break;
  default:
switchD_0001d68c_caseD_2:
    piVar4 = (int *)FUN_0001c660(param_1);
    return piVar4;
  case 5:
    iVar2 = FUN_00020f70(param_1);
    if (iVar2 == 0) goto switchD_0001d68c_caseD_2;
    iVar2 = FUN_00020fb0(param_1,0);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    iVar3 = FUN_0001d668(param_1);
    if (iVar3 == 0) {
      return (int *)0x0;
    }
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x22;
    piVar4[2] = iVar2;
    piVar4[3] = iVar3;
    *piVar4 = DAT_0001d7bc + 0x1d716;
LAB_0001d79e:
    *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
    return piVar4;
  case 7:
    *(byte **)param_1 = pbVar7 + 1;
    piVar4 = (int *)FUN_0001eb18(param_1);
LAB_0001d744:
    if (((piVar4 != (int *)0x0) &&
        (pcVar5 = *(char **)param_1, pcVar5 != *(char **)((int)param_1 + 4))) && (*pcVar5 == 'E')) {
      *(char **)param_1 = pcVar5 + 1;
      return piVar4;
    }
    return (int *)0x0;
  }
  piVar4 = (int *)0x0;
  switch(*pcVar11) {
  case 'A':
    iVar2 = FUN_0001c660(param_1);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    pcVar5 = *(char **)param_1;
    if (pcVar5 == *(char **)((int)param_1 + 4)) {
      return (int *)0x0;
    }
    if (*pcVar5 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 1;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0xc);
    *(undefined1 *)(piVar4 + 1) = 0x4a;
    piVar4[2] = iVar2;
    puVar9 = (undefined *)(_UNK_00020014 + 0x1fcb6);
    goto code_r0x0001fffc;
  default:
    goto LAB_0001fcb6;
  case 'D':
    iVar2 = FUN_0001bec0(param_1,&UNK_0001fd6e + _UNK_00020068,2);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    pcVar5 = *(char **)param_1;
    if ((pcVar5 != *(char **)((int)param_1 + 4)) && (*pcVar5 == '0')) {
      pcVar5 = pcVar5 + 1;
      *(char **)param_1 = pcVar5;
    }
    if (pcVar5 != *(char **)((int)param_1 + 4)) {
      if (*pcVar5 == 'E') {
        *(char **)param_1 = pcVar5 + 1;
        pcVar5 = &UNK_0001fd9c + _UNK_0002006c;
        piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
        sVar6 = strlen(pcVar5);
        piVar4[2] = (int)pcVar5;
        piVar4[3] = sVar6;
        *(undefined1 *)(piVar4 + 1) = 8;
        *piVar4 = DAT_00020988 + 0x2097a;
        *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
        return piVar4;
      }
      return (int *)0x0;
    }
    return (int *)0x0;
  case 'T':
    goto LAB_0001fcde;
  case 'U':
    if ((uint)((int)pcVar8 - (int)pcVar11) < 2) {
      return (int *)0x0;
    }
    if (pcVar5[2] != 'l') {
      return (int *)0x0;
    }
    iVar2 = FUN_0002098c(param_1,0);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    pcVar5 = *(char **)param_1;
    if (pcVar5 == *(char **)((int)param_1 + 4)) {
      return (int *)0x0;
    }
    if (*pcVar5 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 1;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0xc);
    *(undefined1 *)(piVar4 + 1) = 0x4b;
    piVar4[2] = iVar2;
    puVar9 = &UNK_0001fe70 + _UNK_00020070;
    goto code_r0x0001fffc;
  case '_':
    iVar2 = FUN_0001bec0(param_1,&UNK_0001fdb2 + _UNK_00020064,2);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    piVar4 = (int *)FUN_0001bef4(param_1);
    if (piVar4 == (int *)0x0) {
      return (int *)0x0;
    }
    pcVar5 = *(char **)param_1;
    if (pcVar5 == *(char **)((int)param_1 + 4)) {
      return (int *)0x0;
    }
    if (*pcVar5 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 1;
    return piVar4;
  case 'a':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 0xb;
    puVar9 = &UNK_0001fe16 + _UNK_00020028;
    break;
  case 'b':
    iVar2 = FUN_0001bec0(param_1,&UNK_0001fe7a + _UNK_0002001c,3);
    if (iVar2 == 0) {
      iVar2 = FUN_0001bec0(param_1,&UNK_0001ff4a + _UNK_00020020,3);
      if (iVar2 == 0) {
        return (int *)0x0;
      }
      iStack_20 = 1;
    }
    else {
      iStack_20 = 0;
    }
    piVar4 = (int *)func_0x00020910(param_1,&iStack_20);
    return piVar4;
  case 'c':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 4;
    puVar9 = &UNK_0001fe92 + _UNK_00020024;
    break;
  case 'd':
    pcVar11 = pcVar5 + 2;
    *(char **)param_1 = pcVar11;
    if ((uint)((int)pcVar8 - (int)pcVar11) < 0x11) {
      return (int *)0x0;
    }
    pcVar12 = pcVar5 + 0x12;
    for (iVar2 = 0; iVar2 != 0x10; iVar2 = iVar2 + 1) {
      uVar10 = (byte)pcVar11[iVar2] - 0x30;
      bVar14 = 9 < uVar10;
      bVar13 = uVar10 == 10;
      if (bVar14) {
        uVar10 = (byte)pcVar11[iVar2] - 0x61;
        bVar13 = uVar10 == 5;
      }
      if ((bVar14 && 4 < uVar10) && !bVar13) {
        return (int *)0x0;
      }
    }
    *(char **)param_1 = pcVar12;
    if (pcVar12 == pcVar8) {
      return (int *)0x0;
    }
    if (*pcVar12 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 0x13;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x4f;
    piVar4[2] = (int)pcVar11;
    piVar4[3] = 0x10;
    puVar9 = (undefined *)(_UNK_0002005c + 0x1fffe);
    goto code_r0x0001fffc;
  case 'e':
    pcVar11 = pcVar5 + 2;
    *(char **)param_1 = pcVar11;
    if ((uint)((int)pcVar8 - (int)pcVar11) < 0x11) {
      return (int *)0x0;
    }
    pcVar12 = pcVar5 + 0x12;
    for (iVar2 = 0; iVar2 != 0x10; iVar2 = iVar2 + 1) {
      uVar10 = (byte)pcVar11[iVar2] - 0x30;
      bVar14 = 9 < uVar10;
      bVar13 = uVar10 == 10;
      if (bVar14) {
        uVar10 = (byte)pcVar11[iVar2] - 0x61;
        bVar13 = uVar10 == 5;
      }
      if ((bVar14 && 4 < uVar10) && !bVar13) {
        return (int *)0x0;
      }
    }
    *(char **)param_1 = pcVar12;
    if (pcVar12 == pcVar8) {
      return (int *)0x0;
    }
    if (*pcVar12 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 0x13;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x50;
    piVar4[2] = (int)pcVar11;
    piVar4[3] = 0x10;
    puVar9 = &UNK_0001ffca + _UNK_00020060;
    goto code_r0x0001fffc;
  case 'f':
    pcVar11 = pcVar5 + 2;
    *(char **)param_1 = pcVar11;
    if ((uint)((int)pcVar8 - (int)pcVar11) < 9) {
      return (int *)0x0;
    }
    pcVar12 = pcVar5 + 10;
    for (iVar2 = 0; iVar2 != 8; iVar2 = iVar2 + 1) {
      uVar10 = (byte)pcVar11[iVar2] - 0x30;
      bVar14 = 9 < uVar10;
      bVar13 = uVar10 == 10;
      if (bVar14) {
        uVar10 = (byte)pcVar11[iVar2] - 0x61;
        bVar13 = uVar10 == 5;
      }
      if ((bVar14 && 4 < uVar10) && !bVar13) {
        return (int *)0x0;
      }
    }
    *(char **)param_1 = pcVar12;
    if (pcVar12 == pcVar8) {
      return (int *)0x0;
    }
    if (*pcVar12 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 0xb;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x4e;
    piVar4[2] = (int)pcVar11;
    piVar4[3] = 8;
    puVar9 = &UNK_0001ff96 + _UNK_00020058;
code_r0x0001fffc:
    *piVar4 = (int)(puVar9 + 8);
LAB_00020000:
    *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
LAB_0001fcde:
    return piVar4;
  case 'h':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 0xd;
    puVar9 = &UNK_0001fe24 + _UNK_0002002c;
    break;
  case 'i':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 0;
    puVar9 = &UNK_0001fdfa + _UNK_00020038;
    break;
  case 'j':
    *(char **)param_1 = pcVar5 + 2;
    puVar9 = &UNK_0001fd38 + _UNK_0002003c;
    goto code_r0x0001fe9a;
  case 'l':
    *(char **)param_1 = pcVar5 + 2;
    puVar9 = &UNK_0001fe9c + _UNK_00020040;
code_r0x0001fe9a:
    iVar2 = 1;
    break;
  case 'm':
    *(char **)param_1 = pcVar5 + 2;
    puVar9 = &UNK_0001feaa + _UNK_00020044;
    goto code_r0x0001fea8;
  case 'n':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 8;
    puVar9 = &UNK_0001ff26 + _UNK_00020050;
    break;
  case 'o':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 0x11;
    puVar9 = &UNK_0001ff18 + _UNK_00020054;
    break;
  case 's':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 5;
    puVar9 = &UNK_0001fd24 + _UNK_00020030;
    break;
  case 't':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 0xe;
    puVar9 = &UNK_0001fe08 + _UNK_00020034;
    break;
  case 'w':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 7;
    puVar9 = &UNK_0001ff34 + _UNK_00020018;
    break;
  case 'x':
    *(char **)param_1 = pcVar5 + 2;
    puVar9 = &UNK_0001fd2e + _UNK_00020048;
code_r0x0001fea8:
    iVar2 = 2;
    break;
  case 'y':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 3;
    puVar9 = &UNK_0001fdec + _UNK_0002004c;
  }
  FUN_0001c5c0(&iStack_20,param_1,1);
  if (((local_1c == 0) || (pcVar5 = *(char **)param_1, pcVar5 == *(char **)((int)param_1 + 4))) ||
     (*pcVar5 != 'E')) {
    piVar4 = (int *)0x0;
  }
  else {
    *(char **)param_1 = pcVar5 + 1;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x18);
    *(undefined1 *)(piVar4 + 1) = 0x4d;
    iVar3 = _UNK_0002090c;
    piVar4[2] = (int)puVar9;
    piVar4[3] = iVar2;
    *piVar4 = (int)(&UNK_000208f0 + iVar3);
    piVar4[4] = iStack_20;
    piVar4[5] = local_1c;
    *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
  }
  return piVar4;
}




// ============================================================
// Function #153
// Name: FUN_0001d7c0
// Address: 0001d7c0
// JNI: NO
// ============================================================


void FUN_0001d7c0(undefined4 *param_1,undefined4 *param_2)

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
// Function #154
// Name: FUN_0001d830
// Address: 0001d830
// JNI: NO
// ============================================================


void FUN_0001d830(undefined4 *param_1,int param_2,uint param_3)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  
  iVar3 = *(int *)(param_2 + 0xc);
  if ((uint)(iVar3 - *(int *)(param_2 + 8) >> 2) < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001d8b0 + 0x1d8aa,DAT_0001d8b4 + 0x1d8ac,0xb18,DAT_0001d8b8 + 0x1d8ae,
                 &stack0xfffffff8);
  }
  iVar2 = *(int *)(param_2 + 8) + param_3 * 4;
  iVar4 = iVar3 - iVar2;
  uVar1 = FUN_0001dbc0(param_2 + 0x198,iVar4);
  if (iVar3 != iVar2) {
    __aeabi_memmove4(uVar1,iVar2,iVar4);
  }
  *param_1 = uVar1;
  param_1[1] = iVar4 >> 2;
  if ((uint)(*(int *)(param_2 + 0xc) - *(int *)(param_2 + 8) >> 2) < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001d8bc + 0x1d896,DAT_0001d8c0 + 0x1d898,0x86,DAT_0001d8c4 + 0x1d89a);
  }
  *(uint *)(param_2 + 0xc) = *(int *)(param_2 + 8) + param_3 * 4;
  return;
}




// ============================================================
// Function #155
// Name: FUN_0001d8c8
// Address: 0001d8c8
// JNI: NO
// ============================================================


void FUN_0001d8c8(int param_1)

{
  undefined1 uVar1;
  
  uVar1 = *(undefined1 *)(param_1 + 0x186);
  *(undefined1 *)(param_1 + 0x186) = 1;
  FUN_0001eb18(param_1);
  *(undefined1 *)(param_1 + 0x186) = uVar1;
  return;
}




// ============================================================
// Function #156
// Name: FUN_0001d8ec
// Address: 0001d8ec
// JNI: NO
// ============================================================


int * FUN_0001d8ec(int *param_1)

{
  FUN_0001d928(*param_1 + 0x14c,param_1 + 1);
  FUN_0001d9b6(*param_1 + 0x120,param_1 + 8);
  FUN_0001be62(param_1 + 8);
  FUN_0001be4a(param_1 + 1);
  return param_1;
}




// ============================================================
// Function #157
// Name: FUN_0001d928
// Address: 0001d928
// JNI: NO
// ============================================================


undefined4 * FUN_0001d928(undefined4 *param_1,undefined4 *param_2)

{
  undefined4 *__ptr;
  undefined4 uVar1;
  undefined4 *puVar2;
  undefined4 *puVar3;
  undefined4 *puVar4;
  
  puVar3 = param_2 + 3;
  puVar2 = (undefined4 *)*param_2;
  puVar4 = param_1 + 3;
  __ptr = (undefined4 *)*param_1;
  if (puVar2 == puVar3) {
    if (__ptr != puVar4) {
      free(__ptr);
      *param_1 = puVar4;
      param_1[1] = puVar4;
      puVar2 = (undefined4 *)*param_2;
      param_1[2] = param_1 + 7;
      __ptr = puVar4;
    }
    puVar3 = puVar2;
    if ((undefined4 *)param_2[1] != puVar2) {
      __aeabi_memmove4(__ptr,puVar2,(int)param_2[1] - (int)puVar2);
      puVar2 = (undefined4 *)param_2[1];
      __ptr = (undefined4 *)*param_1;
      puVar3 = (undefined4 *)*param_2;
    }
    param_1[1] = ((int)puVar2 - (int)puVar3) + (int)__ptr;
    param_2[1] = puVar3;
  }
  else {
    *param_1 = puVar2;
    if (__ptr == puVar4) {
      uVar1 = param_2[2];
      param_1[1] = param_2[1];
      param_1[2] = uVar1;
      *param_2 = puVar3;
      param_2[1] = puVar3;
      param_2[2] = param_2 + 7;
    }
    else {
      *param_2 = __ptr;
      uVar1 = param_1[1];
      param_1[1] = param_2[1];
      param_2[1] = uVar1;
      uVar1 = param_1[2];
      param_1[2] = param_2[2];
      param_2[2] = uVar1;
      param_2[1] = *param_2;
    }
  }
  return param_1;
}




// ============================================================
// Function #158
// Name: FUN_0001d9b6
// Address: 0001d9b6
// JNI: NO
// ============================================================


undefined4 * FUN_0001d9b6(undefined4 *param_1,undefined4 *param_2)

{
  undefined4 *__ptr;
  undefined4 uVar1;
  undefined4 *puVar2;
  undefined4 *puVar3;
  undefined4 *puVar4;
  
  puVar3 = param_2 + 3;
  puVar2 = (undefined4 *)*param_2;
  puVar4 = param_1 + 3;
  __ptr = (undefined4 *)*param_1;
  if (puVar2 == puVar3) {
    if (__ptr != puVar4) {
      free(__ptr);
      *param_1 = puVar4;
      param_1[1] = puVar4;
      puVar2 = (undefined4 *)*param_2;
      param_1[2] = param_1 + 0xb;
      __ptr = puVar4;
    }
    puVar3 = puVar2;
    if ((undefined4 *)param_2[1] != puVar2) {
      __aeabi_memmove4(__ptr,puVar2,(int)param_2[1] - (int)puVar2);
      puVar2 = (undefined4 *)param_2[1];
      __ptr = (undefined4 *)*param_1;
      puVar3 = (undefined4 *)*param_2;
    }
    param_1[1] = ((int)puVar2 - (int)puVar3) + (int)__ptr;
    param_2[1] = puVar3;
  }
  else {
    *param_1 = puVar2;
    if (__ptr == puVar4) {
      uVar1 = param_2[2];
      param_1[1] = param_2[1];
      param_1[2] = uVar1;
      *param_2 = puVar3;
      param_2[1] = puVar3;
      param_2[2] = param_2 + 0xb;
    }
    else {
      *param_2 = __ptr;
      uVar1 = param_1[1];
      param_1[1] = param_2[1];
      param_2[1] = uVar1;
      uVar1 = param_1[2];
      param_1[2] = param_2[2];
      param_2[2] = uVar1;
      param_2[1] = *param_2;
    }
  }
  return param_1;
}




// ============================================================
// Function #159
// Name: FUN_0001da44
// Address: 0001da44
// JNI: NO
// ============================================================


bool FUN_0001da44(undefined4 *param_1,int param_2,undefined4 param_3,int param_4)

{
  char *pcVar1;
  bool bVar2;
  undefined4 *puStack_20;
  int local_1c;
  undefined4 uStack_18;
  int local_14;
  
  pcVar1 = (char *)*param_1;
  if (pcVar1 == (char *)param_1[1]) {
LAB_0001dabc:
    bVar2 = true;
  }
  else {
    local_14 = param_4;
    puStack_20 = param_1;
    local_1c = param_2;
    uStack_18 = param_3;
    if (*pcVar1 == 'h') {
      *param_1 = pcVar1 + 1;
      FUN_0001c5c0(&uStack_18,param_1,1);
    }
    else {
      if (*pcVar1 != 'v') goto LAB_0001dabc;
      *param_1 = pcVar1 + 1;
      FUN_0001c5c0(&uStack_18,param_1,1);
      if (local_14 == 0) {
        return true;
      }
      pcVar1 = (char *)*param_1;
      if (pcVar1 == (char *)param_1[1]) {
        return true;
      }
      if (*pcVar1 != '_') {
        return true;
      }
      *param_1 = pcVar1 + 1;
      FUN_0001c5c0(&puStack_20,param_1,1);
      local_14 = local_1c;
    }
    bVar2 = true;
    if (((local_14 != 0) && (pcVar1 = (char *)*param_1, pcVar1 != (char *)param_1[1])) &&
       (bVar2 = *pcVar1 != '_', !bVar2)) {
      *param_1 = pcVar1 + 1;
    }
  }
  return bVar2;
}




// ============================================================
// Function #160
// Name: FUN_0001dac4
// Address: 0001dac4
// JNI: NO
// ============================================================


undefined4 FUN_0001dac4(undefined4 *param_1,int *param_2)

{
  byte *pbVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  bool bVar5;
  bool bVar6;
  
  pbVar1 = (byte *)*param_1;
  if ((byte *)param_1[1] == pbVar1) {
    return 1;
  }
  uVar2 = (uint)*pbVar1;
  if (0x2f < uVar2) {
    bVar6 = 0x39 < uVar2;
    bVar5 = uVar2 == 0x3a;
    if (bVar6) {
      uVar2 = uVar2 - 0x41;
      bVar5 = uVar2 == 0x19;
    }
    if ((!bVar6 || uVar2 < 0x19) || bVar5) {
      iVar3 = 0;
      while ((pbVar1 != (byte *)param_1[1] && (uVar2 = (uint)*pbVar1, 0x2f < uVar2))) {
        if (uVar2 < 0x3a) {
          iVar4 = -0x30;
        }
        else {
          if (0x19 < uVar2 - 0x41) break;
          iVar4 = -0x37;
        }
        pbVar1 = pbVar1 + 1;
        *param_1 = pbVar1;
        iVar3 = iVar4 + iVar3 * 0x24 + uVar2;
      }
      *param_2 = iVar3;
      return 0;
    }
  }
  return 1;
}




