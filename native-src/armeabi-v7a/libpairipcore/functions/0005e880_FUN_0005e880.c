/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005e880
 * Address  : 0005e880
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005e880(undefined4 param_1,int param_2,undefined4 *param_3)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  undefined1 *puVar4;
  int iVar5;
  undefined1 *puVar6;
  uint local_58;
  uint local_54;
  undefined1 *local_50;
  uint local_4c;
  uint local_48;
  undefined1 *local_44;
  int local_40;
  int local_3c;
  int local_38;
  int local_34;
  int local_30;
  int local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_0005eaf4 + 0x5e89c);
  (**(code **)(*(int *)*param_3 + 8))(&local_34,(int *)*param_3,0x100);
  iVar1 = local_30;
  iVar5 = local_34;
  uVar3 = local_30 - local_34;
  if (uVar3 < 0xfffffff8) {
    if (uVar3 < 0xb) {
      local_58 = CONCAT31(local_58._1_3_,(char)uVar3 * '\x02');
      puVar4 = (undefined1 *)((uint)&local_58 | 1);
    }
    else {
      puVar4 = (undefined1 *)FUN_000a0370((uVar3 | 7) + 1);
      local_58 = (uVar3 | 7) + 2;
      local_54 = uVar3;
      local_50 = puVar4;
    }
    if (iVar5 != iVar1) {
      __aeabi_memcpy(puVar4,iVar5,uVar3);
      puVar4 = puVar4 + uVar3;
    }
    puVar6 = local_50;
    uVar3 = local_54;
    uVar2 = local_58;
    *puVar4 = 0;
    (**(code **)(*(int *)*param_3 + 8))(&local_40,(int *)*param_3,0x100);
    iVar1 = local_3c;
    iVar5 = local_40;
    if ((uVar2 & 1) == 0) {
      uVar3 = uVar2 >> 1 & 0x7f;
      puVar6 = (undefined1 *)((uint)&local_58 | 1);
    }
    uVar2 = local_3c - local_40;
    if (uVar2 < 0xfffffff8) {
      if (uVar2 < 0xb) {
        puVar4 = (undefined1 *)((uint)&local_4c | 1);
        local_4c = CONCAT31(local_4c._1_3_,(char)uVar2 * '\x02');
      }
      else {
        puVar4 = (undefined1 *)FUN_000a0370((uVar2 | 7) + 1);
        local_4c = (uVar2 | 7) + 2;
        local_48 = uVar2;
        local_44 = puVar4;
      }
      if (iVar5 != iVar1) {
        __aeabi_memcpy(puVar4,iVar5,uVar2);
        puVar4 = puVar4 + uVar2;
      }
      *puVar4 = 0;
      puVar4 = local_44;
      uVar2 = local_48;
      if ((local_4c & 1) == 0) {
        uVar2 = local_4c >> 1 & 0x7f;
        puVar4 = (undefined1 *)((uint)&local_4c | 1);
      }
      iVar5 = DAT_0005eaf8 + 0x5ea30;
      FUN_0002da50(param_2,0,puVar6,uVar3,puVar4,uVar2,iVar5,0);
      if (uVar3 != 0 || uVar2 != 0) {
        FUN_0002da50(param_2,1,puVar6,uVar3,puVar4,uVar2,iVar5,0);
      }
      *(undefined4 *)(param_2 + 0x40) = 1;
      *(undefined4 *)(param_2 + 0x44) = 0;
      if ((local_4c & 1) != 0) {
        FUN_00023f68(local_44,local_4c & 0xfffffffe);
      }
      if (local_40 != 0) {
        local_3c = local_40;
        FUN_00023f68(local_40,local_38 - local_40);
      }
      if ((local_58 & 1) != 0) {
        FUN_00023f68(local_50,local_58 & 0xfffffffe);
      }
      if (local_34 != 0) {
        local_30 = local_34;
        FUN_00023f68(local_34,local_2c - local_34);
      }
      if (**(int **)(DAT_0005eafc + 0x5eadc) != local_28) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_00026b08();
}


