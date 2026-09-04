/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000240ec
 * Address  : 000240ec
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000240ec(undefined4 param_1,undefined4 param_2,undefined4 param_3)

{
  int iVar1;
  uint *puVar2;
  uint uVar3;
  
  iVar1 = FUN_0001b400();
  *(int *)(iVar1 + 4) = *(int *)(iVar1 + 4) + 1;
  iVar1 = FUN_00024084(param_1,param_2,param_3);
  *(undefined4 *)(iVar1 + 4) = 1;
  FUN_000248ec(iVar1 + 0x28);
  iVar1 = FUN_00024122(iVar1);
  FUN_00024006(iVar1 + 0x28);
  puVar2 = (uint *)FUN_0001b2d4(*(undefined4 *)(iVar1 + 0x14));
  iVar1 = FUN_0001b400();
  if ((*puVar2 >> 8 | puVar2[1] << 0x18) == DAT_00024188 && DAT_00024184 == puVar2[1] >> 8) {
    uVar3 = puVar2[-1];
    if (uVar3 == 0) {
      puVar2[-2] = *(uint *)(iVar1 + 8);
      *(uint **)(iVar1 + 8) = puVar2 + -10;
    }
    puVar2[-1] = uVar3 + 1;
  }
  else {
    if (*(int *)(iVar1 + 8) != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b280();
    }
    *(uint **)(iVar1 + 8) = puVar2 + -10;
  }
                    /* WARNING: Could not recover jumptable at 0x00024178. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)0x24135)(1);
  return;
}


