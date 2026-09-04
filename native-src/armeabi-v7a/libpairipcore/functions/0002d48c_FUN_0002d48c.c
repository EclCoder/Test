/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002d48c
 * Address  : 0002d48c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Type propagation algorithm not settling */

void FUN_0002d48c(undefined4 param_1,undefined4 *param_2)

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
  undefined8 local_d8;
  char *local_d0;
  uint local_cc;
  size_t local_c8;
  uint local_c4;
  ulonglong local_c0;
  undefined4 local_b8;
  uint local_b0;
  uint local_ac;
  uint local_a8;
  char acStack_a0 [32];
  char acStack_80 [92];
  int local_24;
  
  local_24 = **(int **)(DAT_0002d780 + 0x2d4a4);
  if ((code *)*param_2 != (code *)0x0) {
    if (**(int **)(DAT_0002d784 + 0x2d4cc) == local_24) {
                    /* WARNING: Could not recover jumptable at 0x0002d4e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*param_2)(param_1,DAT_0002d788 + 0x2d4e4,param_2[1]);
      return;
    }
    goto LAB_0002d724;
  }
  __system_property_read(param_1,acStack_a0,acStack_80);
  sVar2 = strlen(acStack_a0);
  if (0xfffffff7 < sVar2) goto LAB_0002d77c;
  if (sVar2 < 0xb) {
    uVar8 = (uint)&local_cc | 1;
    local_cc = CONCAT31(local_cc._1_3_,(char)(sVar2 << 1));
    if (sVar2 != 0) goto LAB_0002d554;
  }
  else {
    uVar8 = FUN_000a0370((sVar2 | 7) + 1);
    local_cc = (sVar2 | 7) + 2;
    local_c8 = sVar2;
    local_c4 = uVar8;
LAB_0002d554:
    __aeabi_memcpy(uVar8,acStack_a0,sVar2);
  }
  iVar4 = DAT_0002d78c + 0x2d578;
  *(undefined1 *)(uVar8 + sVar2) = 0;
  puVar3 = (ulonglong *)FUN_0001a414(&local_cc,iVar4);
  local_c0 = *puVar3;
  local_b8 = (undefined4)puVar3[1];
  *(undefined4 *)puVar3 = 0;
  *(undefined4 *)((int)puVar3 + 4) = 0;
  *(undefined4 *)(puVar3 + 1) = 0;
  sVar2 = strlen(acStack_80);
  if (0xfffffff7 < sVar2) {
LAB_0002d77c:
                    /* WARNING: Subroutine does not return */
    FUN_00026b08();
  }
  if (sVar2 < 0xb) {
    uVar8 = (uint)&local_b0 | 1;
    local_b0 = CONCAT31(local_b0._1_3_,(char)(sVar2 << 1));
    if (sVar2 != 0) goto LAB_0002d5f0;
  }
  else {
    uVar8 = FUN_000a0370((sVar2 | 7) + 1);
    local_b0 = (sVar2 | 7) + 2;
    local_ac = sVar2;
    local_a8 = uVar8;
LAB_0002d5f0:
    __aeabi_memcpy(uVar8,acStack_80,sVar2);
  }
  *(undefined1 *)(uVar8 + sVar2) = 0;
  uVar5 = local_a8;
  uVar8 = local_ac;
  if ((local_b0 & 1) == 0) {
    uVar8 = local_b0 >> 1 & 0x7f;
    uVar5 = (uint)&local_b0 | 1;
  }
  puVar3 = (ulonglong *)FUN_0001a178(&local_c0,uVar5,uVar8);
  uVar9 = *puVar3;
  local_d0 = *(char **)(puVar3 + 1);
  local_d8._0_1_ = (byte)uVar9;
  uVar8 = 0xcbf29ce4;
  uVar5 = 0x84222325;
  *(undefined4 *)puVar3 = 0;
  *(undefined4 *)((int)puVar3 + 4) = 0;
  *(undefined4 *)(puVar3 + 1) = 0;
  local_d8._4_4_ = (uint)(uVar9 >> 0x20);
  pcVar7 = local_d0;
  if ((uVar9 & 1) == 0) {
    pcVar7 = (char *)((uint)&local_d8 | 1);
    local_d8._4_4_ = (uint)((byte)local_d8 >> 1);
  }
  for (; local_d8._4_4_ != 0; local_d8._4_4_ = local_d8._4_4_ - 1) {
    uVar1 = (ulonglong)uVar5;
    iVar4 = uVar5 * 0x100;
    uVar5 = (uint)(uVar1 * 0x1b3) ^ (int)*pcVar7;
    uVar8 = uVar8 * 0x1b3 + (int)(uVar1 * 0x1b3 >> 0x20) + iVar4 ^ (int)*pcVar7 >> 0x1f;
    pcVar7 = pcVar7 + 1;
  }
  local_d8 = uVar9;
  if ((uVar9 & 1) != 0) {
    local_d8._0_4_ = (uint)uVar9;
    uVar6 = (uint)local_d8 & 0xfffffffe;
    FUN_00023f68(local_d0,uVar6);
  }
  if ((local_b0 & 1) != 0) {
    FUN_00023f68(local_a8,local_b0 & 0xfffffffe);
  }
  if ((local_c0 & 1) != 0) {
    FUN_00023f68(local_b8,(uint)local_c0 & 0xfffffffe);
  }
  if ((local_cc & 1) != 0) {
    FUN_00023f68(local_c4,local_cc & 0xfffffffe);
  }
  local_a8 = 0;
  local_b0 = uVar5;
  local_ac = uVar8;
  FUN_00028a34(&local_c0,param_2[1],uVar5,uVar8);
  if (**(int **)(DAT_0002d790 + 0x2d714) == local_24) {
    return;
  }
LAB_0002d724:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


