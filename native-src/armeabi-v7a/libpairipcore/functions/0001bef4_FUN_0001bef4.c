/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001bef4
 * Address  : 0001bef4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


