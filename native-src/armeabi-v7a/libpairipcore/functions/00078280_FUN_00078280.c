/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00078280
 * Address  : 00078280
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Type propagation algorithm not settling */

void FUN_00078280(int param_1,byte *param_2)

{
  char cVar1;
  char cVar2;
  char cVar3;
  char cVar4;
  char cVar5;
  char cVar6;
  byte bVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  int ******ppppppiVar11;
  int ******ppppppiVar12;
  char *pcVar13;
  undefined4 *puVar14;
  uint uVar15;
  char *pcVar16;
  int *******pppppppiVar17;
  size_t sVar18;
  undefined1 *puVar19;
  int *piVar20;
  int iVar21;
  byte *pbVar22;
  int *******pppppppiVar23;
  int *******pppppppiVar24;
  uint uVar25;
  undefined4 uVar26;
  uint uVar27;
  int *******pppppppiVar28;
  bool bVar29;
  uint local_128;
  size_t local_124;
  uint local_120;
  uint local_11c;
  int ******local_118 [2];
  int aiStack_110 [4];
  int *local_100;
  int ******local_f8 [2];
  int *local_f0;
  int ******local_e8;
  int *******local_d0;
  char local_c8;
  int ******local_c0 [2];
  int ******local_b8 [2];
  uint local_b0;
  int *******local_98;
  char local_90;
  uint local_88;
  int *******local_80;
  undefined4 local_7c;
  int *******local_70;
  uint local_68 [2];
  int *******local_60;
  undefined4 local_5c;
  int *******local_50;
  uint local_48;
  int *******local_44;
  int *******local_40;
  undefined4 local_3c;
  int *******local_30;
  int local_28;
  
  pcVar13 = (char *)FUN_00025e6c(DAT_000791e0 + 0x7829c);
  local_28 = **(int **)(DAT_000791e4 + 0x782b0);
  if (*pcVar13 == '\x01') {
    puVar14 = (undefined4 *)FUN_00025e6c(DAT_000791e8 + 0x782c8);
    uVar26 = *puVar14;
    piVar20 = *(int **)(param_1 + 0x18);
  }
  else {
    puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079c9c + 0x79b24);
    uVar26 = FUN_00076fc0();
    iVar21 = DAT_00079ca0;
    *puVar14 = uVar26;
    puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79b40);
    *puVar19 = 1;
    piVar20 = *(int **)(param_1 + 0x18);
  }
  if (piVar20 == (int *)0x0) goto LAB_00079b54;
  (**(code **)(*piVar20 + 0x18))(local_118);
  pppppppiVar28 = local_f8;
  FUN_0009bd30(pppppppiVar28,uVar26,local_118);
  ppppppiVar11 = local_118[0];
  local_118[0] = (int ******)0x0;
  if (ppppppiVar11 != (int ******)0x0) {
    local_c0[0] = ppppppiVar11;
    if (local_100 == (int *)0x0) goto LAB_00079b54;
    (**(code **)(*local_100 + 0x18))(local_100,local_c0);
  }
  if (local_100 == aiStack_110) {
    iVar21 = 0x10;
LAB_00078364:
    (**(code **)(*local_100 + iVar21))();
  }
  else {
    iVar21 = 0x14;
    if (local_100 != (int *)0x0) goto LAB_00078364;
  }
  ppppppiVar12 = local_e8;
  ppppppiVar11 = local_c0[0];
  if (local_f8[0] == (int ******)0x0) {
    pcVar13 = (char *)FUN_000a0398(0x40);
    uVar8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    uVar9 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    uVar10 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    pcVar13[0] = '\0';
    pcVar13[1] = '\0';
    pcVar13[2] = '\0';
    pcVar13[3] = '\0';
    *(undefined4 *)(pcVar13 + 4) = uVar8;
    *(undefined4 *)(pcVar13 + 8) = uVar9;
    *(undefined4 *)(pcVar13 + 0xc) = uVar10;
    pcVar13[0x10] = '\0';
    pcVar13[0x11] = '\0';
    pcVar13[0x12] = '\0';
    pcVar13[0x13] = '\0';
    *(undefined4 *)(pcVar13 + 0x14) = uVar8;
    *(undefined4 *)(pcVar13 + 0x18) = uVar9;
    *(undefined4 *)(pcVar13 + 0x1c) = uVar10;
    pcVar13[0x20] = '\0';
    pcVar13[0x21] = '\0';
    pcVar13[0x22] = '\0';
    pcVar13[0x23] = '\0';
    *(undefined4 *)(pcVar13 + 0x24) = uVar8;
    *(undefined4 *)(pcVar13 + 0x28) = uVar9;
    *(undefined4 *)(pcVar13 + 0x2c) = uVar10;
    pcVar13[0x30] = '\0';
    pcVar13[0x31] = '\0';
    pcVar13[0x32] = '\0';
    pcVar13[0x33] = '\0';
    *(undefined4 *)(pcVar13 + 0x34) = uVar8;
    *(undefined4 *)(pcVar13 + 0x38) = uVar9;
    *(undefined4 *)(pcVar13 + 0x3c) = uVar10;
    uVar15 = 0;
    iVar21 = DAT_000791ec + 0x783ac;
    do {
      pcVar13[uVar15] = *(byte *)(iVar21 + (uVar15 & 7)) ^ *(byte *)(iVar21 + uVar15 + 8);
      uVar15 = uVar15 + 1;
    } while (uVar15 != 0x40);
    pcVar16 = (char *)FUN_000a0370(0x40);
    cVar1 = pcVar13[1];
    cVar2 = pcVar13[2];
    cVar3 = pcVar13[3];
    cVar4 = pcVar13[4];
    cVar5 = pcVar13[5];
    *pcVar16 = *pcVar13;
    cVar6 = pcVar13[6];
    pcVar16[1] = cVar1;
    cVar1 = pcVar13[7];
    pcVar16[2] = cVar2;
    cVar2 = pcVar13[8];
    pcVar16[3] = cVar3;
    cVar3 = pcVar13[9];
    pcVar16[4] = cVar4;
    cVar4 = pcVar13[10];
    pcVar16[5] = cVar5;
    cVar5 = pcVar13[0xb];
    pcVar16[6] = cVar6;
    cVar6 = pcVar13[0xc];
    pcVar16[7] = cVar1;
    cVar1 = pcVar13[0xd];
    pcVar16[8] = cVar2;
    cVar2 = pcVar13[0xe];
    pcVar16[9] = cVar3;
    cVar3 = pcVar13[0xf];
    pcVar16[10] = cVar4;
    cVar4 = pcVar13[0x10];
    pcVar16[0xb] = cVar5;
    cVar5 = pcVar13[0x11];
    pcVar16[0xc] = cVar6;
    cVar6 = pcVar13[0x12];
    pcVar16[0xd] = cVar1;
    cVar1 = pcVar13[0x13];
    pcVar16[0xe] = cVar2;
    cVar2 = pcVar13[0x14];
    pcVar16[0xf] = cVar3;
    cVar3 = pcVar13[0x15];
    pcVar16[0x10] = cVar4;
    cVar4 = pcVar13[0x16];
    pcVar16[0x11] = cVar5;
    cVar5 = pcVar13[0x17];
    pcVar16[0x12] = cVar6;
    cVar6 = pcVar13[0x18];
    pcVar16[0x13] = cVar1;
    cVar1 = pcVar13[0x19];
    pcVar16[0x14] = cVar2;
    cVar2 = pcVar13[0x1a];
    pcVar16[0x15] = cVar3;
    cVar3 = pcVar13[0x1b];
    pcVar16[0x16] = cVar4;
    cVar4 = pcVar13[0x1c];
    pcVar16[0x17] = cVar5;
    cVar5 = pcVar13[0x1d];
    pcVar16[0x18] = cVar6;
    cVar6 = pcVar13[0x1e];
    pcVar16[0x19] = cVar1;
    cVar1 = pcVar13[0x1f];
    pcVar16[0x1a] = cVar2;
    cVar2 = pcVar13[0x20];
    pcVar16[0x1b] = cVar3;
    cVar3 = pcVar13[0x21];
    pcVar16[0x1c] = cVar4;
    cVar4 = pcVar13[0x22];
    pcVar16[0x1d] = cVar5;
    cVar5 = pcVar13[0x23];
    pcVar16[0x1e] = cVar6;
    cVar6 = pcVar13[0x24];
    pcVar16[0x1f] = cVar1;
    cVar1 = pcVar13[0x25];
    pcVar16[0x20] = cVar2;
    cVar2 = pcVar13[0x26];
    pcVar16[0x21] = cVar3;
    cVar3 = pcVar13[0x27];
    pcVar16[0x22] = cVar4;
    cVar4 = pcVar13[0x28];
    pcVar16[0x23] = cVar5;
    cVar5 = pcVar13[0x29];
    pcVar16[0x24] = cVar6;
    cVar6 = pcVar13[0x2a];
    pcVar16[0x25] = cVar1;
    cVar1 = pcVar13[0x2b];
    pcVar16[0x26] = cVar2;
    cVar2 = pcVar13[0x2c];
    pcVar16[0x27] = cVar3;
    cVar3 = pcVar13[0x2d];
    pcVar16[0x28] = cVar4;
    cVar4 = pcVar13[0x2e];
    pcVar16[0x29] = cVar5;
    cVar5 = pcVar13[0x2f];
    pcVar16[0x2a] = cVar6;
    cVar6 = pcVar13[0x30];
    pcVar16[0x2b] = cVar1;
    cVar1 = pcVar13[0x31];
    pcVar16[0x2c] = cVar2;
    cVar2 = pcVar13[0x32];
    pcVar16[0x2d] = cVar3;
    cVar3 = pcVar13[0x33];
    pcVar16[0x2e] = cVar4;
    cVar4 = pcVar13[0x34];
    pcVar16[0x2f] = cVar5;
    cVar5 = pcVar13[0x35];
    pcVar16[0x30] = cVar6;
    cVar6 = pcVar13[0x36];
    pcVar16[0x31] = cVar1;
    cVar1 = pcVar13[0x37];
    pcVar16[0x32] = cVar2;
    cVar2 = pcVar13[0x38];
    pcVar16[0x33] = cVar3;
    cVar3 = pcVar13[0x39];
    pcVar16[0x34] = cVar4;
    cVar4 = pcVar13[0x3a];
    pcVar16[0x35] = cVar5;
    cVar5 = pcVar13[0x3b];
    pcVar16[0x36] = cVar6;
    cVar6 = pcVar13[0x3c];
    pcVar16[0x37] = cVar1;
    pcVar16[0x3d] = pcVar13[0x3d];
    pcVar16[0x38] = cVar2;
    pcVar16[0x39] = cVar3;
    pcVar16[0x3a] = cVar4;
    pcVar16[0x3b] = cVar5;
    pcVar16[0x3c] = cVar6;
    pcVar16[0x3e] = pcVar13[0x3e];
    pcVar16[0x3f] = '\0';
    FUN_00023f74(pcVar13);
    pppppppiVar17 = (int *******)strlen(pcVar16);
    if ((int *******)0xfffffff7 < pppppppiVar17) goto LAB_00079c98;
    if (pppppppiVar17 < (int *******)0xb) {
      pppppppiVar23 = (int *******)((uint)&local_48 | 1);
      local_48 = CONCAT31(local_48._1_3_,(char)((int)pppppppiVar17 << 1));
      if (pppppppiVar17 != (int *******)0x0) goto LAB_00078638;
    }
    else {
      pppppppiVar23 = (int *******)FUN_000a0370(((uint)pppppppiVar17 | 7) + 1);
      local_48 = ((uint)pppppppiVar17 | 7) + 2;
      local_44 = pppppppiVar17;
      local_40 = pppppppiVar23;
LAB_00078638:
      __aeabi_memcpy(pppppppiVar23,pcVar16,pppppppiVar17);
    }
    *(undefined1 *)((int)pppppppiVar23 + (int)pppppppiVar17) = 0;
    pppppppiVar17 = local_c0;
    FUN_000970d8(pppppppiVar17,uVar26,&local_48);
    if ((local_48 & 1) != 0) {
      FUN_00023f68(local_40,local_48 & 0xfffffffe);
    }
    FUN_00023f68(pcVar16,0x40);
    if (local_c0[0] == (int ******)0x0) {
      if (*(char *)(param_1 + 4) == '\x01') {
        if (local_90 != '\0') {
          pcVar13 = (char *)FUN_000a0398(0x17);
          pcVar13[0] = '\0';
          pcVar13[1] = '\0';
          pcVar13[2] = '\0';
          pcVar13[3] = '\0';
          *(undefined4 *)(pcVar13 + 4) =
               *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
          *(undefined4 *)(pcVar13 + 8) =
               *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
          *(undefined4 *)(pcVar13 + 0xc) =
               *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
          *pcVar13 = 'c';
          pcVar13[1] = 'o';
          pcVar13[2] = 'm';
          pcVar13[3] = '.';
          pcVar13[4] = 'g';
          pcVar13[5] = 'o';
          pcVar13[6] = 'o';
          pcVar13[7] = 'g';
          pcVar13[8] = 'l';
          pcVar13[9] = 'e';
          pcVar13[10] = '.';
          pcVar13[0xb] = 'a';
          pcVar13[0xc] = 'n';
          pcVar13[0xd] = 'd';
          pcVar13[0xe] = 'r';
          pcVar13[0xf] = '\0';
          pcVar13[0x10] = '\0';
          pcVar13[0x11] = '\0';
          pcVar13[0x12] = '\0';
          pcVar13[0xf] = 'o';
          pcVar13[0x10] = 'i';
          pcVar13[0x11] = 'd';
          pcVar13[0x13] = '\0';
          pcVar13[0x14] = '\0';
          pcVar13[0x15] = '\0';
          pcVar13[0x16] = '\0';
          pcVar13[0x12] = '.';
          pcVar13[0x13] = 'g';
          pcVar13[0x14] = 'm';
          pcVar13[0x15] = 's';
          pcVar13[0x16] = '\0';
          pcVar16 = (char *)FUN_000a0370(0x18);
          cVar1 = pcVar13[1];
          cVar2 = pcVar13[2];
          cVar3 = pcVar13[3];
          *pcVar16 = *pcVar13;
          cVar4 = pcVar13[4];
          pcVar16[1] = cVar1;
          cVar1 = pcVar13[5];
          pcVar16[2] = cVar2;
          cVar2 = pcVar13[6];
          pcVar16[3] = cVar3;
          cVar3 = pcVar13[7];
          pcVar16[4] = cVar4;
          cVar4 = pcVar13[8];
          pcVar16[5] = cVar1;
          cVar1 = pcVar13[9];
          pcVar16[6] = cVar2;
          cVar2 = pcVar13[10];
          pcVar16[7] = cVar3;
          cVar3 = pcVar13[0xb];
          pcVar16[8] = cVar4;
          cVar4 = pcVar13[0xc];
          pcVar16[9] = cVar1;
          cVar1 = pcVar13[0xd];
          pcVar16[10] = cVar2;
          cVar2 = pcVar13[0xe];
          pcVar16[0xb] = cVar3;
          cVar3 = pcVar13[0xf];
          cVar5 = pcVar13[0x10];
          pcVar16[0xc] = cVar4;
          cVar4 = pcVar13[0x11];
          pcVar16[0xd] = cVar1;
          cVar1 = pcVar13[0x12];
          pcVar16[0xe] = cVar2;
          cVar2 = pcVar13[0x13];
          pcVar16[0xf] = cVar3;
          cVar3 = pcVar13[0x14];
          pcVar16[0x10] = cVar5;
          bVar7 = pcVar13[0x15];
          pppppppiVar17 = (int *******)(uint)bVar7;
          pcVar16[0x11] = cVar4;
          pcVar16[0x12] = cVar1;
          pcVar16[0x13] = cVar2;
          pcVar16[0x14] = cVar3;
          pcVar16[0x16] = '\0';
          pcVar16[0x15] = bVar7;
          FUN_00023f74(pcVar13);
          pppppppiVar23 = (int *******)strlen(pcVar16);
          if ((int *******)0xfffffff7 < pppppppiVar23) goto LAB_00079c98;
          if (pppppppiVar23 < (int *******)0xb) {
            local_48 = CONCAT31(local_48._1_3_,(char)((int)pppppppiVar23 << 1));
            pppppppiVar24 = (int *******)((uint)&local_48 | 1);
            if (pppppppiVar23 != (int *******)0x0) goto LAB_0007899c;
          }
          else {
            pppppppiVar17 = (int *******)((uint)pppppppiVar23 | 7);
            pppppppiVar24 = (int *******)FUN_000a0370((int)pppppppiVar17 + 1);
            local_48 = (int)pppppppiVar17 + 2;
            local_44 = pppppppiVar23;
            local_40 = pppppppiVar24;
LAB_0007899c:
            __aeabi_memcpy(pppppppiVar24,pcVar16,pppppppiVar23);
          }
          *(undefined1 *)((int)pppppppiVar24 + (int)pppppppiVar23) = 0;
          FUN_00097470(local_b8,&local_48);
          if ((local_48 & 1) != 0) {
            FUN_00023f68(local_40,local_48 & 0xfffffffe);
          }
          FUN_00023f68(pcVar16,0x18);
          goto LAB_000789e8;
        }
LAB_00079ad4:
        FUN_000289c4();
      }
      else {
LAB_000789e8:
        if (local_90 == '\0') goto LAB_00079ad4;
        pcVar13 = (char *)FUN_000a0398(0x3e);
        uVar26 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        uVar8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        uVar9 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        pcVar13[0] = '\0';
        pcVar13[1] = '\0';
        pcVar13[2] = '\0';
        pcVar13[3] = '\0';
        *(undefined4 *)(pcVar13 + 4) = uVar26;
        *(undefined4 *)(pcVar13 + 8) = uVar8;
        *(undefined4 *)(pcVar13 + 0xc) = uVar9;
        pcVar13[0x10] = '\0';
        pcVar13[0x11] = '\0';
        pcVar13[0x12] = '\0';
        pcVar13[0x13] = '\0';
        *(undefined4 *)(pcVar13 + 0x14) = uVar26;
        *(undefined4 *)(pcVar13 + 0x18) = uVar8;
        *(undefined4 *)(pcVar13 + 0x1c) = uVar9;
        pcVar13[0x20] = '\0';
        pcVar13[0x21] = '\0';
        pcVar13[0x22] = '\0';
        pcVar13[0x23] = '\0';
        *(undefined4 *)(pcVar13 + 0x24) = uVar26;
        *(undefined4 *)(pcVar13 + 0x28) = uVar8;
        *(undefined4 *)(pcVar13 + 0x2c) = uVar9;
        pcVar13[0x2e] = '\0';
        pcVar13[0x2f] = '\0';
        pcVar13[0x30] = '\0';
        pcVar13[0x31] = '\0';
        *(undefined4 *)(pcVar13 + 0x32) = uVar26;
        *(undefined4 *)(pcVar13 + 0x36) = uVar8;
        *(undefined4 *)(pcVar13 + 0x3a) = uVar9;
        uVar15 = 0;
        iVar21 = DAT_000799c0 + 0x78a28;
        do {
          pcVar13[uVar15] = *(byte *)(iVar21 + (uVar15 & 7)) ^ *(byte *)(iVar21 + uVar15 + 8);
          uVar15 = uVar15 + 1;
        } while (uVar15 != 0x3e);
        pcVar16 = (char *)FUN_000a0370(0x40);
        cVar1 = pcVar13[1];
        cVar2 = pcVar13[2];
        cVar3 = pcVar13[3];
        cVar4 = pcVar13[4];
        cVar5 = pcVar13[5];
        *pcVar16 = *pcVar13;
        cVar6 = pcVar13[6];
        pcVar16[1] = cVar1;
        cVar1 = pcVar13[7];
        pcVar16[2] = cVar2;
        cVar2 = pcVar13[8];
        pcVar16[3] = cVar3;
        cVar3 = pcVar13[9];
        pcVar16[4] = cVar4;
        cVar4 = pcVar13[10];
        pcVar16[5] = cVar5;
        cVar5 = pcVar13[0xb];
        pcVar16[6] = cVar6;
        cVar6 = pcVar13[0xc];
        pcVar16[7] = cVar1;
        cVar1 = pcVar13[0xd];
        pcVar16[8] = cVar2;
        cVar2 = pcVar13[0xe];
        pcVar16[9] = cVar3;
        cVar3 = pcVar13[0xf];
        pcVar16[10] = cVar4;
        cVar4 = pcVar13[0x10];
        pcVar16[0xb] = cVar5;
        cVar5 = pcVar13[0x11];
        pcVar16[0xc] = cVar6;
        cVar6 = pcVar13[0x12];
        pcVar16[0xd] = cVar1;
        cVar1 = pcVar13[0x13];
        pcVar16[0xe] = cVar2;
        cVar2 = pcVar13[0x14];
        pcVar16[0xf] = cVar3;
        cVar3 = pcVar13[0x15];
        pcVar16[0x10] = cVar4;
        cVar4 = pcVar13[0x16];
        pcVar16[0x11] = cVar5;
        cVar5 = pcVar13[0x17];
        pcVar16[0x12] = cVar6;
        cVar6 = pcVar13[0x18];
        pcVar16[0x13] = cVar1;
        cVar1 = pcVar13[0x19];
        pcVar16[0x14] = cVar2;
        cVar2 = pcVar13[0x1a];
        pcVar16[0x15] = cVar3;
        cVar3 = pcVar13[0x1b];
        pcVar16[0x16] = cVar4;
        cVar4 = pcVar13[0x1c];
        pcVar16[0x17] = cVar5;
        cVar5 = pcVar13[0x1d];
        pcVar16[0x18] = cVar6;
        cVar6 = pcVar13[0x1e];
        pcVar16[0x19] = cVar1;
        cVar1 = pcVar13[0x1f];
        pcVar16[0x1a] = cVar2;
        cVar2 = pcVar13[0x20];
        pcVar16[0x1b] = cVar3;
        cVar3 = pcVar13[0x21];
        pcVar16[0x1c] = cVar4;
        cVar4 = pcVar13[0x22];
        pcVar16[0x1d] = cVar5;
        cVar5 = pcVar13[0x23];
        pcVar16[0x1e] = cVar6;
        cVar6 = pcVar13[0x24];
        pcVar16[0x1f] = cVar1;
        cVar1 = pcVar13[0x25];
        pcVar16[0x20] = cVar2;
        cVar2 = pcVar13[0x26];
        pcVar16[0x21] = cVar3;
        cVar3 = pcVar13[0x27];
        pcVar16[0x22] = cVar4;
        cVar4 = pcVar13[0x28];
        pcVar16[0x23] = cVar5;
        cVar5 = pcVar13[0x29];
        pcVar16[0x24] = cVar6;
        cVar6 = pcVar13[0x2a];
        pcVar16[0x25] = cVar1;
        cVar1 = pcVar13[0x2b];
        pcVar16[0x26] = cVar2;
        cVar2 = pcVar13[0x2c];
        pcVar16[0x27] = cVar3;
        cVar3 = pcVar13[0x2d];
        pcVar16[0x28] = cVar4;
        cVar4 = pcVar13[0x2e];
        pcVar16[0x29] = cVar5;
        cVar5 = pcVar13[0x2f];
        pcVar16[0x2a] = cVar6;
        cVar6 = pcVar13[0x30];
        pcVar16[0x2b] = cVar1;
        cVar1 = pcVar13[0x31];
        pcVar16[0x2c] = cVar2;
        cVar2 = pcVar13[0x32];
        pcVar16[0x2d] = cVar3;
        cVar3 = pcVar13[0x33];
        pcVar16[0x2e] = cVar4;
        cVar4 = pcVar13[0x34];
        pcVar16[0x2f] = cVar5;
        cVar5 = pcVar13[0x35];
        pcVar16[0x30] = cVar6;
        cVar6 = pcVar13[0x36];
        pcVar16[0x31] = cVar1;
        cVar1 = pcVar13[0x37];
        pcVar16[0x32] = cVar2;
        cVar2 = pcVar13[0x38];
        pcVar16[0x33] = cVar3;
        cVar3 = pcVar13[0x39];
        pcVar16[0x34] = cVar4;
        cVar4 = pcVar13[0x3a];
        pcVar16[0x35] = cVar5;
        cVar5 = pcVar13[0x3b];
        pcVar16[0x37] = cVar1;
        pcVar16[0x36] = cVar6;
        pcVar16[0x38] = cVar2;
        pcVar16[0x39] = cVar3;
        pcVar16[0x3a] = cVar4;
        pcVar16[0x3b] = cVar5;
        pcVar16[0x3c] = pcVar13[0x3c];
        pcVar16[0x3d] = '\0';
        FUN_00023f74(pcVar13);
        sVar18 = strlen(pcVar16);
        if (0xfffffff7 < sVar18) goto LAB_00079c98;
        if (sVar18 < 0xb) {
          uVar15 = (uint)&local_128 | 1;
          local_128 = CONCAT31(local_128._1_3_,(char)(sVar18 << 1));
          if (sVar18 != 0) goto LAB_00078ca4;
        }
        else {
          uVar15 = FUN_000a0370((sVar18 | 7) + 1);
          local_128 = (sVar18 | 7) + 2;
          local_124 = sVar18;
          local_120 = uVar15;
LAB_00078ca4:
          __aeabi_memcpy(uVar15,pcVar16,sVar18);
        }
        uVar25 = (uint)&local_128 | 1;
        *(undefined1 *)(uVar15 + sVar18) = 0;
        uVar15 = local_120;
        if ((local_128 & 1) == 0) {
          uVar15 = uVar25;
        }
        uVar15 = (*(code *)(*local_b8[0])[0xa7])(local_b8[0],uVar15);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079ca4 + 0x78cf4);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079ca8 + 0x78d0c);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cac + 0x79b64);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079cb0;
          *puVar14 = uVar26;
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79b80);
          *puVar19 = 1;
        }
        pppppppiVar23 = (int *******)(DAT_00079cb4 + 0x78d30);
        pbVar22 = *(byte **)(param_2 + 8);
        if ((*param_2 & 1) == 0) {
          pbVar22 = param_2 + 1;
        }
        local_88 = uVar15;
        local_80 = pppppppiVar23;
        local_7c = uVar26;
        local_70 = (int *******)&local_80;
        uVar15 = (*(code *)(*local_b8[0])[0xa7])(local_b8[0],pbVar22);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079cb8 + 0x78d64);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cbc + 0x78d7c);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cc0 + 0x79b98);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079cc4;
          *puVar14 = uVar26;
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79bb4);
          *puVar19 = 1;
        }
        local_68[0] = uVar15;
        local_60 = pppppppiVar23;
        local_5c = uVar26;
        local_50 = (int *******)&local_60;
        uVar15 = FUN_000765d8(local_b8[0],local_b0,*(undefined4 *)(DAT_00079cc8 + 0x78dc0),local_88,
                              uVar15);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079ccc + 0x78dc8);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cd0 + 0x78de0);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cd4 + 0x79bcc);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079cd8;
          *puVar14 = uVar26;
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79be8);
          *puVar19 = 1;
        }
        local_3c = uVar26;
        pppppppiVar17 = (int *******)&local_40;
        iVar21 = 0x10;
        local_30 = pppppppiVar17;
        local_48 = 0;
        local_40 = pppppppiVar23;
        if (((uVar15 == 0) ||
            (local_11c = uVar15, FUN_0009de6c(pppppppiVar17,&local_11c), local_30 == pppppppiVar17))
           || (iVar21 = 0x14, local_30 != (int *******)0x0)) {
          (**(code **)((int)*local_30 + iVar21))();
        }
        uVar15 = local_68[0];
        local_68[0] = 0;
        if (uVar15 != 0) {
          local_11c = uVar15;
          if (local_50 == (int *******)0x0) goto LAB_00079b54;
          (*(code *)(*local_50)[6])(local_50,&local_11c);
        }
        if ((int ********)local_50 == &local_60) {
          iVar21 = 0x10;
LAB_00078ea4:
          (**(code **)((int)*local_50 + iVar21))();
        }
        else {
          iVar21 = 0x14;
          if (local_50 != (int *******)0x0) goto LAB_00078ea4;
        }
        uVar15 = local_88;
        local_88 = 0;
        if (uVar15 != 0) {
          local_68[0] = uVar15;
          if (local_70 == (int *******)0x0) goto LAB_00079b54;
          (*(code *)(*local_70)[6])(local_70,local_68);
        }
        if ((int ********)local_70 == &local_80) {
          iVar21 = 0x10;
LAB_00078f04:
          (**(code **)((int)*local_70 + iVar21))();
        }
        else {
          iVar21 = 0x14;
          if (local_70 != (int *******)0x0) goto LAB_00078f04;
        }
        if ((local_128 & 1) != 0) {
          FUN_00023f68(local_120,local_128 & 0xfffffffe);
        }
        FUN_00023f68(pcVar16,0x40);
        pppppppiVar28 = pppppppiVar23;
        if (local_90 == '\0') goto LAB_00079ad4;
        pppppppiVar28 = local_b8;
        pcVar13 = (char *)FUN_000a0398(0x3e);
        uVar26 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        uVar8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        uVar9 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        pcVar13[0] = '\0';
        pcVar13[1] = '\0';
        pcVar13[2] = '\0';
        pcVar13[3] = '\0';
        *(undefined4 *)(pcVar13 + 4) = uVar26;
        *(undefined4 *)(pcVar13 + 8) = uVar8;
        *(undefined4 *)(pcVar13 + 0xc) = uVar9;
        pcVar13[0x10] = '\0';
        pcVar13[0x11] = '\0';
        pcVar13[0x12] = '\0';
        pcVar13[0x13] = '\0';
        *(undefined4 *)(pcVar13 + 0x14) = uVar26;
        *(undefined4 *)(pcVar13 + 0x18) = uVar8;
        *(undefined4 *)(pcVar13 + 0x1c) = uVar9;
        pcVar13[0x20] = '\0';
        pcVar13[0x21] = '\0';
        pcVar13[0x22] = '\0';
        pcVar13[0x23] = '\0';
        *(undefined4 *)(pcVar13 + 0x24) = uVar26;
        *(undefined4 *)(pcVar13 + 0x28) = uVar8;
        *(undefined4 *)(pcVar13 + 0x2c) = uVar9;
        pcVar13[0x2e] = '\0';
        pcVar13[0x2f] = '\0';
        pcVar13[0x30] = '\0';
        pcVar13[0x31] = '\0';
        *(undefined4 *)(pcVar13 + 0x32) = uVar26;
        *(undefined4 *)(pcVar13 + 0x36) = uVar8;
        *(undefined4 *)(pcVar13 + 0x3a) = uVar9;
        uVar15 = 0;
        iVar21 = DAT_00079cdc + 0x78f84;
        do {
          pcVar13[uVar15] = *(byte *)(iVar21 + (uVar15 & 7)) ^ *(byte *)(iVar21 + uVar15 + 8);
          uVar15 = uVar15 + 1;
        } while (uVar15 != 0x3e);
        pcVar16 = (char *)FUN_000a0370(0x40);
        cVar1 = pcVar13[1];
        cVar2 = pcVar13[2];
        cVar3 = pcVar13[3];
        cVar4 = pcVar13[4];
        cVar5 = pcVar13[5];
        *pcVar16 = *pcVar13;
        cVar6 = pcVar13[6];
        pcVar16[1] = cVar1;
        cVar1 = pcVar13[7];
        pcVar16[2] = cVar2;
        cVar2 = pcVar13[8];
        pcVar16[3] = cVar3;
        cVar3 = pcVar13[9];
        pcVar16[4] = cVar4;
        cVar4 = pcVar13[10];
        pcVar16[5] = cVar5;
        cVar5 = pcVar13[0xb];
        pcVar16[6] = cVar6;
        cVar6 = pcVar13[0xc];
        pcVar16[7] = cVar1;
        cVar1 = pcVar13[0xd];
        pcVar16[8] = cVar2;
        cVar2 = pcVar13[0xe];
        pcVar16[9] = cVar3;
        cVar3 = pcVar13[0xf];
        pcVar16[10] = cVar4;
        cVar4 = pcVar13[0x10];
        pcVar16[0xb] = cVar5;
        cVar5 = pcVar13[0x11];
        pcVar16[0xc] = cVar6;
        cVar6 = pcVar13[0x12];
        pcVar16[0xd] = cVar1;
        cVar1 = pcVar13[0x13];
        pcVar16[0xe] = cVar2;
        cVar2 = pcVar13[0x14];
        pcVar16[0xf] = cVar3;
        cVar3 = pcVar13[0x15];
        pcVar16[0x10] = cVar4;
        cVar4 = pcVar13[0x16];
        pcVar16[0x11] = cVar5;
        cVar5 = pcVar13[0x17];
        pcVar16[0x12] = cVar6;
        cVar6 = pcVar13[0x18];
        pcVar16[0x13] = cVar1;
        cVar1 = pcVar13[0x19];
        pcVar16[0x14] = cVar2;
        cVar2 = pcVar13[0x1a];
        pcVar16[0x15] = cVar3;
        cVar3 = pcVar13[0x1b];
        pcVar16[0x16] = cVar4;
        cVar4 = pcVar13[0x1c];
        pcVar16[0x17] = cVar5;
        cVar5 = pcVar13[0x1d];
        pcVar16[0x18] = cVar6;
        cVar6 = pcVar13[0x1e];
        pcVar16[0x19] = cVar1;
        cVar1 = pcVar13[0x1f];
        pcVar16[0x1a] = cVar2;
        cVar2 = pcVar13[0x20];
        pcVar16[0x1b] = cVar3;
        cVar3 = pcVar13[0x21];
        pcVar16[0x1c] = cVar4;
        cVar4 = pcVar13[0x22];
        pcVar16[0x1d] = cVar5;
        cVar5 = pcVar13[0x23];
        pcVar16[0x1e] = cVar6;
        cVar6 = pcVar13[0x24];
        pcVar16[0x1f] = cVar1;
        cVar1 = pcVar13[0x25];
        pcVar16[0x20] = cVar2;
        cVar2 = pcVar13[0x26];
        pcVar16[0x21] = cVar3;
        cVar3 = pcVar13[0x27];
        pcVar16[0x22] = cVar4;
        cVar4 = pcVar13[0x28];
        pcVar16[0x23] = cVar5;
        cVar5 = pcVar13[0x29];
        pcVar16[0x24] = cVar6;
        cVar6 = pcVar13[0x2a];
        pcVar16[0x25] = cVar1;
        cVar1 = pcVar13[0x2b];
        pcVar16[0x26] = cVar2;
        cVar2 = pcVar13[0x2c];
        pcVar16[0x27] = cVar3;
        cVar3 = pcVar13[0x2d];
        pcVar16[0x28] = cVar4;
        cVar4 = pcVar13[0x2e];
        pcVar16[0x29] = cVar5;
        cVar5 = pcVar13[0x2f];
        pcVar16[0x2a] = cVar6;
        cVar6 = pcVar13[0x30];
        pcVar16[0x2b] = cVar1;
        cVar1 = pcVar13[0x31];
        pcVar16[0x2c] = cVar2;
        cVar2 = pcVar13[0x32];
        pcVar16[0x2d] = cVar3;
        cVar3 = pcVar13[0x33];
        pcVar16[0x2e] = cVar4;
        cVar4 = pcVar13[0x34];
        pcVar16[0x2f] = cVar5;
        cVar5 = pcVar13[0x35];
        pcVar16[0x30] = cVar6;
        cVar6 = pcVar13[0x36];
        pcVar16[0x31] = cVar1;
        cVar1 = pcVar13[0x37];
        pcVar16[0x32] = cVar2;
        cVar2 = pcVar13[0x38];
        pcVar16[0x33] = cVar3;
        cVar3 = pcVar13[0x39];
        pcVar16[0x34] = cVar4;
        cVar4 = pcVar13[0x3a];
        pcVar16[0x35] = cVar5;
        cVar5 = pcVar13[0x3b];
        pcVar16[0x37] = cVar1;
        pcVar16[0x36] = cVar6;
        pcVar16[0x38] = cVar2;
        pcVar16[0x39] = cVar3;
        pcVar16[0x3a] = cVar4;
        pcVar16[0x3b] = cVar5;
        pcVar16[0x3c] = pcVar13[0x3c];
        pcVar16[0x3d] = '\0';
        FUN_00023f74(pcVar13);
        pppppppiVar24 = (int *******)strlen(pcVar16);
        if ((int *******)0xfffffff7 < pppppppiVar24) goto LAB_00079c98;
        if (pppppppiVar24 < (int *******)0xb) {
          local_48 = CONCAT31(local_48._1_3_,(char)((int)pppppppiVar24 << 1));
          pppppppiVar17 = (int *******)((uint)&local_48 | 1);
          if (pppppppiVar24 != (int *******)0x0) goto LAB_00079210;
        }
        else {
          pppppppiVar17 = (int *******)FUN_000a0370(((uint)pppppppiVar24 | 7) + 1);
          local_48 = ((uint)pppppppiVar24 | 7) + 2;
          local_44 = pppppppiVar24;
          local_40 = pppppppiVar17;
LAB_00079210:
          __aeabi_memcpy(pppppppiVar17,pcVar16,pppppppiVar24);
        }
        *(undefined1 *)((int)pppppppiVar17 + (int)pppppppiVar24) = 0;
        FUN_0009bac8(pppppppiVar28,&local_48,*(undefined4 *)(param_2 + 0x10));
        if ((local_48 & 1) != 0) {
          FUN_00023f68(local_40,local_48 & 0xfffffffe);
        }
        FUN_00023f68(pcVar16,0x40);
        if (local_90 == '\0') goto LAB_00079ad4;
        pcVar13 = (char *)FUN_000a0398(0x3c);
        uVar26 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        uVar8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        uVar9 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        pcVar13[0] = '\0';
        pcVar13[1] = '\0';
        pcVar13[2] = '\0';
        pcVar13[3] = '\0';
        *(undefined4 *)(pcVar13 + 4) = uVar26;
        *(undefined4 *)(pcVar13 + 8) = uVar8;
        *(undefined4 *)(pcVar13 + 0xc) = uVar9;
        pcVar13[0x10] = '\0';
        pcVar13[0x11] = '\0';
        pcVar13[0x12] = '\0';
        pcVar13[0x13] = '\0';
        *(undefined4 *)(pcVar13 + 0x14) = uVar26;
        *(undefined4 *)(pcVar13 + 0x18) = uVar8;
        *(undefined4 *)(pcVar13 + 0x1c) = uVar9;
        pcVar13[0x20] = '\0';
        pcVar13[0x21] = '\0';
        pcVar13[0x22] = '\0';
        pcVar13[0x23] = '\0';
        *(undefined4 *)(pcVar13 + 0x24) = uVar26;
        *(undefined4 *)(pcVar13 + 0x28) = uVar8;
        *(undefined4 *)(pcVar13 + 0x2c) = uVar9;
        pcVar13[0x2c] = '\0';
        pcVar13[0x2d] = '\0';
        pcVar13[0x2e] = '\0';
        pcVar13[0x2f] = '\0';
        *(undefined4 *)(pcVar13 + 0x30) = uVar26;
        *(undefined4 *)(pcVar13 + 0x34) = uVar8;
        *(undefined4 *)(pcVar13 + 0x38) = uVar9;
        uVar15 = 0;
        iVar21 = DAT_00079ce0 + 0x792a4;
        do {
          pcVar13[uVar15] = *(byte *)(iVar21 + (uVar15 & 7)) ^ *(byte *)(iVar21 + uVar15 + 8);
          uVar15 = uVar15 + 1;
        } while (uVar15 != 0x3c);
        pcVar16 = (char *)FUN_000a0370(0x40);
        cVar1 = pcVar13[1];
        cVar2 = pcVar13[2];
        cVar3 = pcVar13[3];
        cVar4 = pcVar13[4];
        cVar5 = pcVar13[5];
        *pcVar16 = *pcVar13;
        cVar6 = pcVar13[6];
        pcVar16[1] = cVar1;
        cVar1 = pcVar13[7];
        pcVar16[2] = cVar2;
        cVar2 = pcVar13[8];
        pcVar16[3] = cVar3;
        cVar3 = pcVar13[9];
        pcVar16[4] = cVar4;
        cVar4 = pcVar13[10];
        pcVar16[5] = cVar5;
        cVar5 = pcVar13[0xb];
        pcVar16[6] = cVar6;
        cVar6 = pcVar13[0xc];
        pcVar16[7] = cVar1;
        cVar1 = pcVar13[0xd];
        pcVar16[8] = cVar2;
        cVar2 = pcVar13[0xe];
        pcVar16[9] = cVar3;
        cVar3 = pcVar13[0xf];
        pcVar16[10] = cVar4;
        cVar4 = pcVar13[0x10];
        pcVar16[0xb] = cVar5;
        cVar5 = pcVar13[0x11];
        pcVar16[0xc] = cVar6;
        cVar6 = pcVar13[0x12];
        pcVar16[0xd] = cVar1;
        cVar1 = pcVar13[0x13];
        pcVar16[0xe] = cVar2;
        cVar2 = pcVar13[0x14];
        pcVar16[0xf] = cVar3;
        cVar3 = pcVar13[0x15];
        pcVar16[0x10] = cVar4;
        cVar4 = pcVar13[0x16];
        pcVar16[0x11] = cVar5;
        cVar5 = pcVar13[0x17];
        pcVar16[0x12] = cVar6;
        cVar6 = pcVar13[0x18];
        pcVar16[0x13] = cVar1;
        cVar1 = pcVar13[0x19];
        pcVar16[0x14] = cVar2;
        cVar2 = pcVar13[0x1a];
        pcVar16[0x15] = cVar3;
        cVar3 = pcVar13[0x1b];
        pcVar16[0x16] = cVar4;
        cVar4 = pcVar13[0x1c];
        pcVar16[0x17] = cVar5;
        cVar5 = pcVar13[0x1d];
        pcVar16[0x18] = cVar6;
        cVar6 = pcVar13[0x1e];
        pcVar16[0x19] = cVar1;
        cVar1 = pcVar13[0x1f];
        pcVar16[0x1a] = cVar2;
        cVar2 = pcVar13[0x20];
        pcVar16[0x1b] = cVar3;
        cVar3 = pcVar13[0x21];
        pcVar16[0x1c] = cVar4;
        cVar4 = pcVar13[0x22];
        pcVar16[0x1d] = cVar5;
        cVar5 = pcVar13[0x23];
        pcVar16[0x1e] = cVar6;
        cVar6 = pcVar13[0x24];
        pcVar16[0x1f] = cVar1;
        cVar1 = pcVar13[0x25];
        pcVar16[0x20] = cVar2;
        cVar2 = pcVar13[0x26];
        pcVar16[0x21] = cVar3;
        cVar3 = pcVar13[0x27];
        pcVar16[0x22] = cVar4;
        cVar4 = pcVar13[0x28];
        pcVar16[0x23] = cVar5;
        cVar5 = pcVar13[0x29];
        pcVar16[0x24] = cVar6;
        cVar6 = pcVar13[0x2a];
        pcVar16[0x25] = cVar1;
        cVar1 = pcVar13[0x2b];
        pcVar16[0x26] = cVar2;
        cVar2 = pcVar13[0x2c];
        pcVar16[0x27] = cVar3;
        cVar3 = pcVar13[0x2d];
        pcVar16[0x28] = cVar4;
        cVar4 = pcVar13[0x2e];
        pcVar16[0x29] = cVar5;
        cVar5 = pcVar13[0x2f];
        pcVar16[0x2a] = cVar6;
        cVar6 = pcVar13[0x30];
        pcVar16[0x2b] = cVar1;
        cVar1 = pcVar13[0x31];
        pcVar16[0x2c] = cVar2;
        cVar2 = pcVar13[0x32];
        pcVar16[0x2d] = cVar3;
        cVar3 = pcVar13[0x33];
        pcVar16[0x2e] = cVar4;
        cVar4 = pcVar13[0x34];
        pcVar16[0x2f] = cVar5;
        cVar5 = pcVar13[0x35];
        pcVar16[0x30] = cVar6;
        cVar6 = pcVar13[0x36];
        pcVar16[0x31] = cVar1;
        cVar1 = pcVar13[0x37];
        pcVar16[0x32] = cVar2;
        cVar2 = pcVar13[0x38];
        pcVar16[0x33] = cVar3;
        cVar3 = pcVar13[0x39];
        pcVar16[0x37] = cVar1;
        pcVar16[0x34] = cVar4;
        pcVar16[0x35] = cVar5;
        pcVar16[0x36] = cVar6;
        pcVar16[0x38] = cVar2;
        pcVar16[0x39] = cVar3;
        pcVar16[0x3a] = pcVar13[0x3a];
        pcVar16[0x3b] = '\0';
        FUN_00023f74(pcVar13);
        pppppppiVar17 = (int *******)strlen(pcVar16);
        if ((int *******)0xfffffff7 < pppppppiVar17) goto LAB_00079c98;
        if (pppppppiVar17 < (int *******)0xb) {
          pppppppiVar24 = (int *******)((uint)&local_48 | 1);
          local_48 = CONCAT31(local_48._1_3_,(char)((int)pppppppiVar17 << 1));
          if (pppppppiVar17 != (int *******)0x0) goto LAB_00079510;
        }
        else {
          pppppppiVar24 = (int *******)FUN_000a0370(((uint)pppppppiVar17 | 7) + 1);
          local_48 = ((uint)pppppppiVar17 | 7) + 2;
          local_44 = pppppppiVar17;
          local_40 = pppppppiVar24;
LAB_00079510:
          __aeabi_memcpy(pppppppiVar24,pcVar16,pppppppiVar17);
        }
        *(undefined1 *)((int)pppppppiVar24 + (int)pppppppiVar17) = 0;
        FUN_0009bac8(pppppppiVar28,&local_48,1);
        if ((local_48 & 1) != 0) {
          FUN_00023f68(local_40,local_48 & 0xfffffffe);
        }
        FUN_00023f68(pcVar16,0x40);
        if (local_90 == '\0') goto LAB_00079ad4;
        pcVar13 = (char *)FUN_000a0398(0x3a);
        uVar26 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        uVar8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        uVar9 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        pcVar13[0] = '\0';
        pcVar13[1] = '\0';
        pcVar13[2] = '\0';
        pcVar13[3] = '\0';
        *(undefined4 *)(pcVar13 + 4) = uVar26;
        *(undefined4 *)(pcVar13 + 8) = uVar8;
        *(undefined4 *)(pcVar13 + 0xc) = uVar9;
        pcVar13[0x10] = '\0';
        pcVar13[0x11] = '\0';
        pcVar13[0x12] = '\0';
        pcVar13[0x13] = '\0';
        *(undefined4 *)(pcVar13 + 0x14) = uVar26;
        *(undefined4 *)(pcVar13 + 0x18) = uVar8;
        *(undefined4 *)(pcVar13 + 0x1c) = uVar9;
        pcVar13[0x20] = '\0';
        pcVar13[0x21] = '\0';
        pcVar13[0x22] = '\0';
        pcVar13[0x23] = '\0';
        *(undefined4 *)(pcVar13 + 0x24) = uVar26;
        *(undefined4 *)(pcVar13 + 0x28) = uVar8;
        *(undefined4 *)(pcVar13 + 0x2c) = uVar9;
        pcVar13[0x2a] = '\0';
        pcVar13[0x2b] = '\0';
        pcVar13[0x2c] = '\0';
        pcVar13[0x2d] = '\0';
        *(undefined4 *)(pcVar13 + 0x2e) = uVar26;
        *(undefined4 *)(pcVar13 + 0x32) = uVar8;
        *(undefined4 *)(pcVar13 + 0x36) = uVar9;
        uVar15 = 0;
        iVar21 = DAT_00079ce4 + 0x795a4;
        do {
          pcVar13[uVar15] = *(byte *)(iVar21 + (uVar15 & 7)) ^ *(byte *)(iVar21 + uVar15 + 8);
          uVar15 = uVar15 + 1;
        } while (uVar15 != 0x3a);
        pcVar16 = (char *)FUN_000a0370(0x40);
        cVar1 = pcVar13[1];
        cVar2 = pcVar13[2];
        cVar3 = pcVar13[3];
        cVar4 = pcVar13[4];
        cVar5 = pcVar13[5];
        *pcVar16 = *pcVar13;
        cVar6 = pcVar13[6];
        pcVar16[1] = cVar1;
        cVar1 = pcVar13[7];
        pcVar16[2] = cVar2;
        cVar2 = pcVar13[8];
        pcVar16[3] = cVar3;
        cVar3 = pcVar13[9];
        pcVar16[4] = cVar4;
        cVar4 = pcVar13[10];
        pcVar16[5] = cVar5;
        cVar5 = pcVar13[0xb];
        pcVar16[6] = cVar6;
        cVar6 = pcVar13[0xc];
        pcVar16[7] = cVar1;
        cVar1 = pcVar13[0xd];
        pcVar16[8] = cVar2;
        cVar2 = pcVar13[0xe];
        pcVar16[9] = cVar3;
        cVar3 = pcVar13[0xf];
        pcVar16[10] = cVar4;
        cVar4 = pcVar13[0x10];
        pcVar16[0xb] = cVar5;
        cVar5 = pcVar13[0x11];
        pcVar16[0xc] = cVar6;
        cVar6 = pcVar13[0x12];
        pcVar16[0xd] = cVar1;
        cVar1 = pcVar13[0x13];
        pcVar16[0xe] = cVar2;
        cVar2 = pcVar13[0x14];
        pcVar16[0xf] = cVar3;
        cVar3 = pcVar13[0x15];
        pcVar16[0x10] = cVar4;
        cVar4 = pcVar13[0x16];
        pcVar16[0x11] = cVar5;
        cVar5 = pcVar13[0x17];
        pcVar16[0x12] = cVar6;
        cVar6 = pcVar13[0x18];
        pcVar16[0x13] = cVar1;
        cVar1 = pcVar13[0x19];
        pcVar16[0x14] = cVar2;
        cVar2 = pcVar13[0x1a];
        pcVar16[0x15] = cVar3;
        cVar3 = pcVar13[0x1b];
        pcVar16[0x16] = cVar4;
        cVar4 = pcVar13[0x1c];
        pcVar16[0x17] = cVar5;
        cVar5 = pcVar13[0x1d];
        pcVar16[0x18] = cVar6;
        cVar6 = pcVar13[0x1e];
        pcVar16[0x19] = cVar1;
        cVar1 = pcVar13[0x1f];
        pcVar16[0x1a] = cVar2;
        cVar2 = pcVar13[0x20];
        pcVar16[0x1b] = cVar3;
        cVar3 = pcVar13[0x21];
        pcVar16[0x1c] = cVar4;
        cVar4 = pcVar13[0x22];
        pcVar16[0x1d] = cVar5;
        cVar5 = pcVar13[0x23];
        pcVar16[0x1e] = cVar6;
        cVar6 = pcVar13[0x24];
        pcVar16[0x1f] = cVar1;
        cVar1 = pcVar13[0x25];
        pcVar16[0x20] = cVar2;
        cVar2 = pcVar13[0x26];
        pcVar16[0x21] = cVar3;
        cVar3 = pcVar13[0x27];
        pcVar16[0x22] = cVar4;
        cVar4 = pcVar13[0x28];
        pcVar16[0x23] = cVar5;
        cVar5 = pcVar13[0x29];
        pcVar16[0x24] = cVar6;
        cVar6 = pcVar13[0x2a];
        pcVar16[0x25] = cVar1;
        cVar1 = pcVar13[0x2b];
        pcVar16[0x26] = cVar2;
        cVar2 = pcVar13[0x2c];
        pcVar16[0x27] = cVar3;
        cVar3 = pcVar13[0x2d];
        pcVar16[0x28] = cVar4;
        cVar4 = pcVar13[0x2e];
        pcVar16[0x29] = cVar5;
        cVar5 = pcVar13[0x2f];
        pcVar16[0x2a] = cVar6;
        cVar6 = pcVar13[0x30];
        pcVar16[0x2b] = cVar1;
        cVar1 = pcVar13[0x31];
        pcVar16[0x2c] = cVar2;
        cVar2 = pcVar13[0x32];
        pcVar16[0x2d] = cVar3;
        cVar3 = pcVar13[0x33];
        pcVar16[0x2e] = cVar4;
        cVar4 = pcVar13[0x34];
        pcVar16[0x2f] = cVar5;
        cVar5 = pcVar13[0x35];
        pcVar16[0x30] = cVar6;
        cVar6 = pcVar13[0x36];
        pcVar16[0x31] = cVar1;
        pcVar16[0x37] = pcVar13[0x37];
        pcVar16[0x32] = cVar2;
        pcVar16[0x33] = cVar3;
        pcVar16[0x34] = cVar4;
        pcVar16[0x35] = cVar5;
        pcVar16[0x36] = cVar6;
        pcVar16[0x38] = pcVar13[0x38];
        pcVar16[0x39] = '\0';
        FUN_00023f74(pcVar13);
        sVar18 = strlen(pcVar16);
        if (0xfffffff7 < sVar18) {
LAB_00079c98:
                    /* WARNING: Subroutine does not return */
          FUN_00026b08();
        }
        if (sVar18 < 0xb) {
          local_128 = CONCAT31(local_128._1_3_,(char)(sVar18 << 1));
          uVar15 = uVar25;
          if (sVar18 != 0) goto LAB_000797fc;
        }
        else {
          uVar15 = FUN_000a0370((sVar18 | 7) + 1);
          local_128 = (sVar18 | 7) + 2;
          local_124 = sVar18;
          local_120 = uVar15;
LAB_000797fc:
          __aeabi_memcpy(uVar15,pcVar16,sVar18);
        }
        *(undefined1 *)(uVar15 + sVar18) = 0;
        uVar15 = *(uint *)(param_2 + 0x1c);
        if ((param_2[0x18] & 1) == 0) {
          uVar15 = (uint)(param_2[0x18] >> 1);
        }
        uVar15 = (*(code *)(*local_b8[0])[0xb0])(local_b8[0],uVar15);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079ce8 + 0x79844);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cec + 0x7985c);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cf0 + 0x79c00);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079cf4;
          *puVar14 = uVar26;
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79c1c);
          *puVar19 = 1;
        }
        bVar7 = param_2[0x18];
        pbVar22 = *(byte **)(param_2 + 0x20);
        if ((bVar7 & 1) == 0) {
          pbVar22 = param_2 + 0x19;
        }
        uVar27 = *(uint *)(param_2 + 0x1c);
        if ((bVar7 & 1) == 0) {
          uVar27 = (uint)(bVar7 >> 1);
        }
        local_88 = uVar15;
        local_80 = pppppppiVar23;
        local_7c = uVar26;
        local_70 = (int *******)&local_80;
        (*(code *)(*local_b8[0])[0xd0])(local_b8[0],uVar15,0,uVar27,pbVar22);
        uVar15 = local_120;
        if ((local_128 & 1) == 0) {
          uVar15 = uVar25;
        }
        uVar15 = (*(code *)(*local_b8[0])[0xa7])(local_b8[0],uVar15);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079cf8 + 0x798e4);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cfc + 0x798fc);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079d00 + 0x79c34);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079d04;
          *puVar14 = uVar26;
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79c50);
          *puVar19 = 1;
        }
        pppppppiVar28 = local_f8;
        param_2 = (byte *)(DAT_00079d08 + 0x79918);
        local_48 = uVar15;
        local_40 = pppppppiVar23;
        local_3c = uVar26;
        local_30 = (int *******)&local_40;
        uVar15 = FUN_000765d8(local_b8[0],local_b0,*(undefined4 *)(DAT_00079d08 + 0x7997c),uVar15,
                              local_88);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079d0c + 0x79950);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079d10 + 0x79968);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079d14 + 0x79c68);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079d18;
          *puVar14 = uVar26;
          param_2 = (byte *)(DAT_00079d1c + 0x79c8c);
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79c88);
          *puVar19 = 1;
        }
        iVar21 = 0x10;
        local_68[0] = 0;
        local_60 = pppppppiVar23;
        local_5c = uVar26;
        local_50 = (int *******)&local_60;
        if (((uVar15 == 0) ||
            (local_11c = uVar15, FUN_0009de6c(&local_60,&local_11c),
            (int ********)local_50 == &local_60)) || (iVar21 = 0x14, local_50 != (int *******)0x0))
        {
          (**(code **)((int)*local_50 + iVar21))();
        }
        uVar15 = local_48;
        pppppppiVar17 = local_c0;
        bVar29 = local_48 != 0;
        local_48 = 0;
        if (bVar29) {
          local_11c = uVar15;
          if (local_30 == (int *******)0x0) goto LAB_00079b54;
          (*(code *)(*local_30)[6])(local_30,&local_11c);
        }
        if ((int ********)local_30 == &local_40) {
          iVar21 = 0x10;
LAB_00079a2c:
          (**(code **)((int)*local_30 + iVar21))();
        }
        else {
          iVar21 = 0x14;
          if (local_30 != (int *******)0x0) goto LAB_00079a2c;
        }
        uVar15 = local_88;
        local_88 = 0;
        if (uVar15 != 0) {
          local_48 = uVar15;
          if (local_70 == (int *******)0x0) goto LAB_00079b54;
          (*(code *)(*local_70)[6])(local_70,&local_48);
        }
        if ((int ********)local_70 == &local_80) {
          iVar21 = 0x10;
LAB_00079a8c:
          (**(code **)((int)*local_70 + iVar21))();
        }
        else {
          iVar21 = 0x14;
          if (local_70 != (int *******)0x0) goto LAB_00079a8c;
        }
        if ((local_128 & 1) != 0) {
          FUN_00023f68(local_120,local_128 & 0xfffffffe);
        }
        FUN_00023f68(pcVar16,0x40);
        cVar1 = '\0';
        if (local_c8 != '\0') {
          cVar1 = local_90;
        }
        if (local_c8 == '\0' || cVar1 == '\0') goto LAB_00079ad4;
      }
      FUN_0007656c(local_f0,local_e8,*(undefined4 *)(param_2 + 0x78),local_b0);
      iVar21 = (**(code **)(*local_f0 + 0x3c))();
      if (iVar21 != 0) {
        (**(code **)(*local_f0 + 0x44))();
      }
    }
    uVar15 = local_b0;
    ppppppiVar12 = local_e8;
    ppppppiVar11 = local_c0[0];
    if (local_90 == '\x01') {
      local_b0 = 0;
      if (uVar15 != 0) {
        local_48 = uVar15;
        if (local_98 == (int *******)0x0) goto LAB_00079b54;
        (*(code *)(*local_98)[6])(local_98,&local_48);
      }
      if (local_98 == pppppppiVar17 + 6) {
        iVar21 = 0x10;
      }
      else {
        iVar21 = 0x14;
        ppppppiVar12 = local_e8;
        ppppppiVar11 = local_c0[0];
        if (local_98 == (int *******)0x0) goto joined_r0x00078974;
      }
      (**(code **)((int)*local_98 + iVar21))();
      ppppppiVar12 = local_e8;
      ppppppiVar11 = local_c0[0];
    }
  }
joined_r0x00078974:
  local_c0[0] = ppppppiVar12;
  local_e8 = local_c0[0];
  if (local_c8 == '\x01') {
    local_e8 = (int ******)0x0;
    if (local_c0[0] != (int ******)0x0) {
      if (local_d0 == (int *******)0x0) {
LAB_00079b54:
                    /* WARNING: Subroutine does not return */
        FUN_000269a8();
      }
      (*(code *)(*local_d0)[6])(local_d0,local_c0);
      ppppppiVar11 = local_c0[0];
    }
    local_c0[0] = ppppppiVar11;
    if (local_d0 == pppppppiVar28 + 6) {
      iVar21 = 0x10;
    }
    else {
      iVar21 = 0x14;
      ppppppiVar11 = local_c0[0];
      if (local_d0 == (int *******)0x0) goto LAB_00078764;
    }
    (**(code **)((int)*local_d0 + iVar21))();
    ppppppiVar11 = local_c0[0];
  }
LAB_00078764:
  local_c0[0] = ppppppiVar11;
  if (**(int **)(DAT_000794ec + 0x78774) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


