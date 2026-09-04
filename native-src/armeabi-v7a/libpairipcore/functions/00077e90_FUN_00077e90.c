/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00077e90
 * Address  : 00077e90
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00077e90(int param_1,undefined4 param_2,undefined4 param_3)

{
  byte bVar1;
  ulonglong uVar2;
  char *pcVar3;
  byte *pbVar4;
  size_t sVar5;
  undefined4 *puVar6;
  void *pvVar7;
  uint uVar8;
  uint uVar9;
  void *pvVar10;
  void *pvVar11;
  char *pcVar12;
  void *pvVar13;
  uint uVar14;
  byte *__s;
  void *pvVar15;
  int iVar16;
  uint local_58;
  uint local_54;
  void *local_50;
  uint local_4c;
  uint local_48;
  char *local_44;
  undefined4 local_40;
  uint local_3c;
  byte *local_38;
  undefined1 auStack_30 [8];
  int local_28;
  
  local_28 = **(int **)(DAT_00078278 + 0x77ea4);
  pcVar12 = *(char **)(param_1 + 4);
  if (pcVar12 == (char *)0x0) goto LAB_00078248;
  sVar5 = strlen(pcVar12);
  if (0xfffffff7 < sVar5) goto LAB_00078270;
  if (sVar5 < 0xb) {
    pvVar10 = (void *)((uint)&local_58 | 1);
    local_58 = CONCAT31(local_58._1_3_,(char)(sVar5 << 1));
    if (sVar5 != 0) goto LAB_00077f18;
  }
  else {
    pvVar10 = (void *)FUN_000a0370((sVar5 | 7) + 1);
    local_58 = (sVar5 | 7) + 2;
    local_54 = sVar5;
    local_50 = pvVar10;
LAB_00077f18:
    __aeabi_memcpy(pvVar10,pcVar12,sVar5);
  }
  iVar16 = 0;
  *(undefined1 *)((int)pvVar10 + sVar5) = 0;
  puVar6 = (undefined4 *)FUN_000a0398(4);
  *puVar6 = 0;
  *(undefined1 *)puVar6 = 0x2e;
  *(undefined1 *)((int)puVar6 + 1) = 0x73;
  *(undefined1 *)((int)puVar6 + 2) = 0x6f;
  *(undefined1 *)((int)puVar6 + 3) = 0;
  local_3c = local_3c & 0xffffff00;
  local_40 = CONCAT13(*(undefined1 *)((int)puVar6 + 2),
                      CONCAT12(*(undefined1 *)((int)puVar6 + 1),CONCAT11(*(undefined1 *)puVar6,6)));
  FUN_00023f74();
  pbVar4 = local_38;
  uVar14 = local_40;
  pvVar11 = (void *)((uint)&local_58 | 1);
  pvVar10 = local_50;
  uVar8 = local_54;
  if ((local_58 & 1) == 0) {
    uVar8 = local_58 >> 1 & 0x7f;
    pvVar10 = pvVar11;
  }
  __s = local_38;
  if ((local_40 & 1) == 0) {
    __s = (byte *)((uint)&local_40 | 1);
  }
  sVar5 = strlen((char *)__s);
  if (sVar5 != 0) {
    pvVar15 = (void *)((int)pvVar10 + uVar8);
    pvVar13 = pvVar15;
    if ((int)sVar5 <= (int)uVar8) {
      bVar1 = *__s;
      pvVar7 = pvVar10;
      do {
        pvVar13 = pvVar15;
        if (((0xfffffffe < uVar8 - sVar5) ||
            (pvVar7 = memchr(pvVar7,(uint)bVar1,(uVar8 - sVar5) + 1), pvVar7 == (void *)0x0)) ||
           (iVar16 = memcmp(pvVar7,__s,sVar5), pvVar13 = pvVar7, iVar16 == 0)) break;
        pvVar7 = (void *)((int)pvVar7 + 1);
        uVar8 = (int)pvVar15 - (int)pvVar7;
        pvVar13 = pvVar15;
      } while ((int)sVar5 <= (int)uVar8);
    }
    iVar16 = (int)pvVar13 - (int)pvVar10;
    if (pvVar13 == pvVar15) {
      iVar16 = -1;
    }
  }
  if ((uVar14 & 1) != 0) {
    FUN_00023f68(pbVar4,local_40 & 0xfffffffe);
  }
  if (iVar16 != -1) {
    uVar8 = FUN_0001a3b0(&local_58,0x2f,0xffffffff);
    if (uVar8 == 0xffffffff) {
      pvVar10 = local_50;
      uVar14 = local_54;
      if ((local_58 & 1) == 0) {
        uVar14 = (uint)((byte)local_58 >> 1);
        pvVar10 = pvVar11;
      }
      if (iVar16 + 3U <= uVar14) {
        uVar14 = iVar16 + 3U;
      }
      if (0xfffffff7 < uVar14) goto LAB_00078270;
      if (uVar14 < 0xb) {
        local_4c = CONCAT31(local_4c._1_3_,(char)(uVar14 << 1));
        pcVar12 = (char *)((uint)&local_4c | 1);
        if (uVar14 == 0) goto LAB_00078190;
      }
      else {
        pcVar12 = (char *)FUN_000a0370((uVar14 | 7) + 1);
        local_4c = (uVar14 | 7) + 2;
        local_48 = uVar14;
        local_44 = pcVar12;
      }
LAB_00078188:
      __aeabi_memmove(pcVar12,pvVar10,uVar14);
    }
    else {
      uVar9 = local_54;
      if ((local_58 & 1) == 0) {
        uVar9 = (uint)((byte)local_58 >> 1);
      }
      if (uVar9 <= uVar8) {
                    /* WARNING: Subroutine does not return */
        FUN_0007727c();
      }
      uVar9 = uVar9 - (uVar8 + 1);
      uVar14 = (iVar16 - uVar8) + 2;
      if (uVar9 < uVar14) {
        uVar14 = uVar9;
      }
      pvVar10 = local_50;
      if ((local_58 & 1) == 0) {
        pvVar10 = pvVar11;
      }
      if (0xfffffff7 < uVar14) {
LAB_00078270:
                    /* WARNING: Subroutine does not return */
        FUN_00026b08();
      }
      if (10 < uVar14) {
        pcVar12 = (char *)FUN_000a0370((uVar14 | 7) + 1);
        local_4c = (uVar14 | 7) + 2;
        local_48 = uVar14;
        local_44 = pcVar12;
LAB_00078154:
        pvVar10 = (void *)((int)pvVar10 + uVar8 + 1);
        goto LAB_00078188;
      }
      local_4c = CONCAT31(local_4c._1_3_,(char)(uVar14 << 1));
      pcVar12 = (char *)((uint)&local_4c | 1);
      if (uVar14 != 0) goto LAB_00078154;
    }
LAB_00078190:
    pcVar3 = local_44;
    uVar9 = local_4c;
    pcVar12[uVar14] = '\0';
    local_3c = 0xcbf29ce4;
    pcVar12 = local_44;
    uVar8 = local_48;
    if ((local_4c & 1) == 0) {
      uVar8 = local_4c >> 1 & 0x7f;
      pcVar12 = (char *)((uint)&local_4c | 1);
    }
    local_40 = 0x84222325;
    for (; uVar8 != 0; uVar8 = uVar8 - 1) {
      uVar2 = (ulonglong)local_40;
      iVar16 = local_40 * 0x100;
      local_40 = (uint)(uVar2 * 0x1b3) ^ (int)*pcVar12;
      local_3c = local_3c * 0x1b3 + (int)(uVar2 * 0x1b3 >> 0x20) + iVar16 ^ (int)*pcVar12 >> 0x1f;
      pcVar12 = pcVar12 + 1;
    }
    local_38 = (byte *)0x0;
    FUN_00028a34(auStack_30,param_3,local_40,local_3c,&local_40);
    if ((uVar9 & 1) != 0) {
      FUN_00023f68(pcVar3,local_4c & 0xfffffffe);
    }
  }
  if ((local_58 & 1) != 0) {
    FUN_00023f68(local_50,local_58 & 0xfffffffe);
  }
LAB_00078248:
  if (**(int **)(DAT_0007827c + 0x78258) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(local_28);
}


