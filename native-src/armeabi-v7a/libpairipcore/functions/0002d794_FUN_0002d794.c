/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002d794
 * Address  : 0002d794
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Type propagation algorithm not settling */

void FUN_0002d794(undefined4 param_1,char *param_2,char *param_3)

{
  ulonglong uVar1;
  size_t sVar2;
  ulonglong *puVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  char *pcVar7;
  uint uVar8;
  ulonglong uVar9;
  uint local_5c;
  size_t local_58;
  uint local_54;
  undefined8 local_50;
  char *local_48;
  uint local_44;
  uint local_40;
  uint local_3c;
  undefined8 local_38;
  undefined4 local_30;
  int local_24;
  
  local_24 = **(int **)(DAT_0002da44 + 0x2d7b4);
  sVar2 = strlen(param_2);
  if (0xfffffff7 < sVar2) goto LAB_0002da40;
  if (sVar2 < 0xb) {
    uVar8 = (uint)&local_5c | 1;
    local_5c = CONCAT31(local_5c._1_3_,(char)(sVar2 << 1));
    if (sVar2 != 0) goto LAB_0002d814;
  }
  else {
    uVar8 = FUN_000a0370((sVar2 | 7) + 1);
    local_5c = (sVar2 | 7) + 2;
    local_58 = sVar2;
    local_54 = uVar8;
LAB_0002d814:
    __aeabi_memcpy(uVar8,param_2,sVar2);
  }
  iVar4 = DAT_0002da48 + 0x2d838;
  *(undefined1 *)(uVar8 + sVar2) = 0;
  puVar3 = (ulonglong *)FUN_0001a414(&local_5c,iVar4);
  local_38 = *puVar3;
  local_30 = (undefined4)puVar3[1];
  *(undefined4 *)puVar3 = 0;
  *(undefined4 *)((int)puVar3 + 4) = 0;
  *(undefined4 *)(puVar3 + 1) = 0;
  sVar2 = strlen(param_3);
  if (0xfffffff7 < sVar2) {
LAB_0002da40:
                    /* WARNING: Subroutine does not return */
    FUN_00026b08();
  }
  if (sVar2 < 0xb) {
    uVar8 = (uint)&local_44 | 1;
    local_44 = CONCAT31(local_44._1_3_,(char)(sVar2 << 1));
    if (sVar2 == 0) goto LAB_0002d8c0;
  }
  else {
    uVar8 = FUN_000a0370((sVar2 | 7) + 1);
    local_44 = (sVar2 | 7) + 2;
    local_40 = sVar2;
    local_3c = uVar8;
  }
  __aeabi_memcpy(uVar8,param_3,sVar2);
LAB_0002d8c0:
  *(undefined1 *)(uVar8 + sVar2) = 0;
  uVar8 = local_40;
  uVar5 = local_3c;
  if ((local_44 & 1) == 0) {
    uVar5 = (uint)&local_44 | 1;
    uVar8 = local_44 >> 1 & 0x7f;
  }
  puVar3 = (ulonglong *)FUN_0001a178(&local_38,uVar5,uVar8);
  uVar9 = *puVar3;
  local_48 = *(char **)(puVar3 + 1);
  local_50._0_1_ = (byte)uVar9;
  uVar8 = 0xcbf29ce4;
  local_50._4_4_ = (uint)(uVar9 >> 0x20);
  pcVar7 = local_48;
  if ((uVar9 & 1) == 0) {
    local_50._4_4_ = (uint)((byte)local_50 >> 1);
    pcVar7 = (char *)((uint)&local_50 | 1);
  }
  uVar5 = 0x84222325;
  *(undefined4 *)puVar3 = 0;
  *(undefined4 *)((int)puVar3 + 4) = 0;
  *(undefined4 *)(puVar3 + 1) = 0;
  for (; local_50._4_4_ != 0; local_50._4_4_ = local_50._4_4_ - 1) {
    uVar1 = (ulonglong)uVar5;
    iVar4 = uVar5 * 0x100;
    uVar5 = (uint)(uVar1 * 0x1b3) ^ (int)*pcVar7;
    uVar8 = uVar8 * 0x1b3 + (int)(uVar1 * 0x1b3 >> 0x20) + iVar4 ^ (int)*pcVar7 >> 0x1f;
    pcVar7 = pcVar7 + 1;
  }
  local_50 = uVar9;
  if ((uVar9 & 1) != 0) {
    local_50._0_4_ = (uint)uVar9;
    uVar6 = (uint)local_50 & 0xfffffffe;
    FUN_00023f68(local_48,uVar6);
  }
  if ((local_44 & 1) != 0) {
    FUN_00023f68(local_3c,local_44 & 0xfffffffe);
  }
  if ((local_38 & 1) != 0) {
    FUN_00023f68(local_30,(uint)local_38 & 0xfffffffe);
  }
  if ((local_5c & 1) != 0) {
    FUN_00023f68(local_54,local_5c & 0xfffffffe);
  }
  local_30 = 0;
  local_38 = CONCAT44(uVar8,uVar5);
  FUN_00028a34(&local_44,param_1,uVar5,uVar8,&local_38);
  if (**(int **)(DAT_0002da4c + 0x2d9d8) == local_24) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


