/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002cab8
 * Address  : 0002cab8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002cab8(byte *param_1)

{
  byte bVar1;
  int iVar2;
  DIR *__dirp;
  short *psVar3;
  dirent *pdVar4;
  size_t sVar5;
  short *psVar6;
  int iVar7;
  uint uVar8;
  uint *puVar9;
  byte *pbVar10;
  byte *pbVar11;
  uint uVar12;
  uint uVar13;
  int iVar14;
  uint *puVar15;
  uint *puVar16;
  int iVar17;
  uint uVar18;
  uint *puVar19;
  uint *local_b4;
  uint local_b0;
  uint local_ac;
  uint local_a8;
  uint local_a0;
  uint uStack_9c;
  short *local_98;
  stat local_90;
  __uid_t _Stack_38;
  __ino_t _Stack_34;
  undefined4 local_30;
  undefined4 local_2c;
  int local_28;
  
  local_90.st_dev._4_4_ = *(__nlink_t *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  local_90._8_4_ = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  local_90.st_ino = *(__ino_t *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  pbVar11 = param_1 + 1;
  local_28 = **(int **)(DAT_0002d018 + 0x2cad8);
  local_90.st_dev._0_4_ = 0;
  local_90.st_mode = 0;
  local_90.st_rdev._0_4_ = 0;
  local_90.st_blksize = 0;
  local_90.st_mtim.tv_sec = 0;
  local_90.__unused4 = 0;
  pbVar10 = *(byte **)(param_1 + 8);
  if ((*param_1 & 1) == 0) {
    pbVar10 = pbVar11;
  }
  local_30 = 0;
  local_2c = 0;
  local_90.st_nlink = local_90.st_dev._4_4_;
  local_90.st_uid = local_90._8_4_;
  local_90.st_gid = local_90.st_ino;
  local_90.st_rdev._4_4_ = local_90.st_dev._4_4_;
  local_90._40_4_ = local_90._8_4_;
  local_90.st_size = local_90.st_ino;
  local_90.st_blocks = local_90.st_dev._4_4_;
  local_90.st_atim.tv_sec = local_90._8_4_;
  local_90.st_atim.tv_nsec = local_90.st_ino;
  local_90.st_mtim.tv_nsec = local_90.st_dev._4_4_;
  local_90.st_ctim.tv_sec = local_90._8_4_;
  local_90.st_ctim.tv_nsec = local_90.st_ino;
  local_90.__unused5 = local_90.st_dev._4_4_;
  _Stack_38 = local_90._8_4_;
  _Stack_34 = local_90.st_ino;
  iVar2 = stat((char *)pbVar10,&local_90);
  if (iVar2 != 0) goto LAB_0002cfe4;
  if ((local_90.st_mode & 0x4000) == 0) goto LAB_0002cfc4;
  pbVar10 = *(byte **)(param_1 + 8);
  if ((*param_1 & 1) == 0) {
    pbVar10 = pbVar11;
  }
  __dirp = opendir((char *)pbVar10);
  if (__dirp == (DIR *)0x0) goto LAB_0002cfe4;
  puVar19 = (uint *)0x0;
  psVar3 = (short *)((uint)&local_a0 | 1);
  local_b4 = (uint *)0x0;
  puVar15 = (uint *)0x0;
  while (pdVar4 = readdir(__dirp), pdVar4 != (dirent *)0x0) {
    sVar5 = strlen(pdVar4->d_name + 8);
    if (0xfffffff7 < sVar5) goto LAB_0002d00c;
    if (sVar5 < 0xb) {
      local_a0 = CONCAT31(local_a0._1_3_,(char)(sVar5 << 1));
      psVar6 = psVar3;
      if (sVar5 != 0) goto LAB_0002cbe4;
    }
    else {
      psVar6 = (short *)FUN_000a0370((sVar5 | 7) + 1);
      local_a0 = (sVar5 | 7) + 2;
      uStack_9c = sVar5;
      local_98 = psVar6;
LAB_0002cbe4:
      __aeabi_memmove(psVar6,pdVar4->d_name + 8,sVar5);
    }
    uVar8 = uStack_9c;
    uVar18 = local_a0;
    *(char *)((int)psVar6 + sVar5) = '\0';
    uVar13 = local_a0 & 1;
    uVar12 = uStack_9c;
    if ((local_a0 & 1) == 0) {
      uVar12 = local_a0 >> 1 & 0x7f;
    }
    puVar16 = puVar15;
    if (uVar12 == 2) {
      psVar6 = local_98;
      if ((local_a0 & 1) == 0) {
        psVar6 = psVar3;
      }
      if (*psVar6 != 0x2e2e) goto LAB_0002cc64;
    }
    else {
      if (uVar12 == 1) {
        psVar6 = local_98;
        if ((local_a0 & 1) == 0) {
          psVar6 = psVar3;
        }
        if ((char)*psVar6 == '.') goto LAB_0002cdb0;
      }
LAB_0002cc64:
      if (puVar19 < local_b4) {
        if ((local_a0 & 1) == 0) {
          puVar19[2] = (uint)local_98;
          *puVar19 = local_a0;
          puVar19[1] = uStack_9c;
          puVar19 = puVar19 + 3;
        }
        else {
          FUN_000289d4(puVar19,local_98,uStack_9c);
          puVar19 = puVar19 + 3;
        }
      }
      else {
        iVar14 = (int)puVar19 - (int)puVar15;
        iVar2 = iVar14 >> 2;
        uVar12 = iVar2 * -0x55555555 + 1;
        if (0x15555555 < uVar12) {
          FUN_0002d47c();
LAB_0002d014:
                    /* WARNING: Subroutine does not return */
          FUN_00026984();
        }
        iVar17 = (int)local_b4 - (int)puVar15;
        iVar7 = iVar17 >> 2;
        if (uVar12 < (uint)(iVar7 * 0x55555556)) {
          uVar12 = iVar7 * 0x55555556;
        }
        if (0xaaaaaa9 < (uint)(iVar7 * -0x55555555)) {
          uVar12 = 0x15555555;
        }
        if (uVar12 == 0) {
          iVar7 = 0;
          puVar19 = (uint *)(iVar2 * 4);
          if ((local_a0 & 1) == 0) goto LAB_0002cd1c;
LAB_0002cd60:
          FUN_000289d4(puVar19,local_98,uVar8);
        }
        else {
          if (0x15555555 < uVar12) goto LAB_0002d014;
          iVar7 = FUN_000a0370(uVar12 * 0xc);
          puVar19 = (uint *)(iVar7 + iVar2 * 4);
          if (uVar13 != 0) goto LAB_0002cd60;
LAB_0002cd1c:
          puVar19[2] = (uint)local_98;
          *puVar19 = local_a0;
          puVar19[1] = uStack_9c;
        }
        local_b4 = (uint *)(iVar7 + uVar12 * 0xc);
        puVar16 = (uint *)((int)puVar19 - iVar14);
        __aeabi_memcpy(puVar16,puVar15,iVar14);
        puVar19 = puVar19 + 3;
        if (puVar15 != (uint *)0x0) {
          FUN_00023f68(puVar15,iVar17);
        }
      }
    }
LAB_0002cdb0:
    puVar15 = puVar16;
    if ((uVar18 & 1) != 0) {
      FUN_00023f68(local_98,local_a0 & 0xfffffffe);
    }
  }
  closedir(__dirp);
  if (puVar15 == puVar19) {
    if (puVar19 != (uint *)0x0) goto LAB_0002cfac;
  }
  else {
    uVar12 = (uint)&local_b0 | 1;
    puVar16 = puVar15;
    do {
      bVar1 = *param_1;
      uVar13 = *(uint *)(param_1 + 4);
      if ((bVar1 & 1) == 0) {
        uVar13 = (uint)(bVar1 >> 1);
      }
      uVar18 = uVar13 + 1;
      if (0xfffffff7 < uVar18) {
LAB_0002d00c:
                    /* WARNING: Subroutine does not return */
        FUN_00026b08();
      }
      if (uVar18 < 0xb) {
        local_ac = 0;
        local_a8 = 0;
        local_b0 = (uint)(byte)((char)uVar18 * '\x02');
        uVar8 = uVar12;
        if (uVar13 != 0) goto LAB_0002ce90;
      }
      else {
        uVar8 = FUN_000a0370((uVar18 | 7) + 1);
        local_b0 = (uVar18 | 7) + 2;
        local_ac = uVar18;
        local_a8 = uVar8;
LAB_0002ce90:
        pbVar10 = *(byte **)(param_1 + 8);
        if ((bVar1 & 1) == 0) {
          pbVar10 = pbVar11;
        }
        __aeabi_memmove(uVar8,pbVar10,uVar13);
      }
      *(undefined2 *)(uVar8 + uVar13) = 0x2f;
      uVar13 = puVar16[1];
      pbVar10 = (byte *)puVar16[2];
      if (((byte)*puVar16 & 1) == 0) {
        uVar13 = (uint)(byte)((byte)*puVar16 >> 1);
        pbVar10 = (byte *)((int)puVar16 + 1);
      }
      puVar9 = (uint *)FUN_0001a178(&local_b0,pbVar10,uVar13);
      local_a0 = *puVar9;
      uStack_9c = puVar9[1];
      local_98 = (short *)puVar9[2];
      *puVar9 = 0;
      puVar9[1] = 0;
      puVar9[2] = 0;
      FUN_0002cab8(&local_a0);
      if ((local_a0 & 1) != 0) {
        FUN_00023f68(local_98,local_a0 & 0xfffffffe);
      }
      if ((local_b0 & 1) != 0) {
        FUN_00023f68(local_a8,local_b0 & 0xfffffffe);
      }
      puVar16 = puVar16 + 3;
    } while (puVar16 != puVar19);
    if (puVar15 != (uint *)0x0) {
      do {
        puVar16 = puVar19 + -3;
        if ((*puVar16 & 1) != 0) {
          FUN_00023f68(puVar19[-1],puVar19[-3] & 0xfffffffe);
        }
        puVar19 = puVar16;
      } while (puVar16 != puVar15);
LAB_0002cfac:
      FUN_00023f68(puVar15,(int)local_b4 - (int)puVar15);
    }
  }
LAB_0002cfc4:
  pbVar10 = *(byte **)(param_1 + 8);
  if ((*param_1 & 1) == 0) {
    pbVar10 = pbVar11;
  }
  remove((char *)pbVar10);
LAB_0002cfe4:
  if (**(int **)(DAT_0002d01c + 0x2cff4) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(local_28);
}


