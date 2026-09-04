/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000284f4
 * Address  : 000284f4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000284f4(int param_1)

{
  uint *puVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint local_128 [64];
  int local_28;
  
  local_28 = **(int **)(DAT_0002877c + 0x28514);
  uVar2 = *(uint *)(param_1 + 8);
  uVar3 = *(uint *)(param_1 + 0xc);
  uVar4 = *(uint *)(param_1 + 0x10);
  uVar5 = *(uint *)(param_1 + 0x14);
  uVar10 = *(uint *)(param_1 + 0x18);
  local_128[0] = uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 |
                 uVar2 >> 0x18;
  local_128[1] = uVar3 << 0x18 | (uVar3 >> 8 & 0xff) << 0x10 | (uVar3 >> 0x10 & 0xff) << 8 |
                 uVar3 >> 0x18;
  local_128[2] = uVar4 << 0x18 | (uVar4 >> 8 & 0xff) << 0x10 | (uVar4 >> 0x10 & 0xff) << 8 |
                 uVar4 >> 0x18;
  uVar2 = *(uint *)(param_1 + 0x1c);
  local_128[3] = uVar5 << 0x18 | (uVar5 >> 8 & 0xff) << 0x10 | (uVar5 >> 0x10 & 0xff) << 8 |
                 uVar5 >> 0x18;
  uVar5 = *(uint *)(param_1 + 0x20);
  local_128[4] = uVar10 << 0x18 | (uVar10 >> 8 & 0xff) << 0x10 | (uVar10 >> 0x10 & 0xff) << 8 |
                 uVar10 >> 0x18;
  uVar10 = *(uint *)(param_1 + 0x24);
  local_128[5] = uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 |
                 uVar2 >> 0x18;
  uVar2 = *(uint *)(param_1 + 0x28);
  uVar3 = *(uint *)(param_1 + 0x2c);
  uVar4 = *(uint *)(param_1 + 0x30);
  uVar14 = *(uint *)(param_1 + 0x34);
  local_128[6] = uVar5 << 0x18 | (uVar5 >> 8 & 0xff) << 0x10 | (uVar5 >> 0x10 & 0xff) << 8 |
                 uVar5 >> 0x18;
  local_128[7] = uVar10 << 0x18 | (uVar10 >> 8 & 0xff) << 0x10 | (uVar10 >> 0x10 & 0xff) << 8 |
                 uVar10 >> 0x18;
  local_128[8] = uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 |
                 uVar2 >> 0x18;
  local_128[9] = uVar3 << 0x18 | (uVar3 >> 8 & 0xff) << 0x10 | (uVar3 >> 0x10 & 0xff) << 8 |
                 uVar3 >> 0x18;
  uVar2 = *(uint *)(param_1 + 0x38);
  uVar3 = *(uint *)(param_1 + 0x3c);
  uVar5 = *(uint *)(param_1 + 0x40);
  local_128[10] =
       uVar4 << 0x18 | (uVar4 >> 8 & 0xff) << 0x10 | (uVar4 >> 0x10 & 0xff) << 8 | uVar4 >> 0x18;
  local_128[0xb] =
       uVar14 << 0x18 | (uVar14 >> 8 & 0xff) << 0x10 | (uVar14 >> 0x10 & 0xff) << 8 | uVar14 >> 0x18
  ;
  local_128[0xc] =
       uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 | uVar2 >> 0x18;
  uVar2 = *(uint *)(param_1 + 0x44);
  local_128[0xd] =
       uVar3 << 0x18 | (uVar3 >> 8 & 0xff) << 0x10 | (uVar3 >> 0x10 & 0xff) << 8 | uVar3 >> 0x18;
  local_128[0xe] =
       uVar5 << 0x18 | (uVar5 >> 8 & 0xff) << 0x10 | (uVar5 >> 0x10 & 0xff) << 8 | uVar5 >> 0x18;
  local_128[0xf] =
       uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 | uVar2 >> 0x18;
  iVar7 = 0;
  uVar2 = local_128[0];
  do {
    iVar6 = iVar7 + -1;
    uVar4 = local_128[0xe - iVar7];
    uVar3 = local_128[1 - iVar7];
    local_128[0x10 - iVar7] =
         ((uVar3 >> 7 | uVar3 << 0x19) ^ (uVar3 >> 0x12 | uVar3 << 0xe) ^ uVar3 >> 3) + uVar2 +
         local_128[9 - iVar7] +
         ((uVar4 >> 0x11 | uVar4 << 0xf) ^ (uVar4 >> 0x13 | uVar4 << 0xd) ^ uVar4 >> 10);
    iVar7 = iVar6;
    uVar2 = uVar3;
  } while (iVar6 != -0x30);
  iVar7 = 0;
  uVar2 = *(uint *)(param_1 + 0x4c);
  uVar3 = *(uint *)(param_1 + 0x5c);
  uVar4 = *(uint *)(param_1 + 0x58);
  uVar5 = *(uint *)(param_1 + 100);
  uVar10 = *(uint *)(param_1 + 0x50);
  uVar14 = *(uint *)(param_1 + 0x54);
  uVar13 = *(uint *)(param_1 + 0x48);
  uVar8 = *(uint *)(param_1 + 0x60);
  do {
    uVar15 = uVar8;
    uVar12 = uVar13;
    uVar11 = uVar10;
    uVar9 = uVar4;
    uVar8 = uVar3;
    uVar10 = uVar2;
    puVar1 = local_128 + iVar7;
    iVar6 = iVar7 * 4;
    iVar7 = iVar7 + 1;
    iVar6 = uVar5 + ((uVar9 >> 6 | uVar9 << 0x1a) ^ (uVar9 >> 0xb | uVar9 << 0x15) ^
                    (uVar9 >> 0x19 | uVar9 << 7)) + (uVar15 & ~uVar9 | uVar8 & uVar9) +
            *(int *)(DAT_00028780 + 0x286ac + iVar6) + *puVar1;
    uVar4 = iVar6 + uVar14;
    uVar13 = ((uVar12 >> 2 | uVar12 << 0x1e) ^ (uVar12 >> 0xd | uVar12 << 0x13) ^
             (uVar12 >> 0x16 | uVar12 << 10)) + (uVar12 & (uVar10 ^ uVar11) ^ uVar10 & uVar11) +
             iVar6;
    uVar2 = uVar12;
    uVar3 = uVar9;
    uVar5 = uVar15;
    uVar14 = uVar11;
  } while (iVar7 != 0x40);
  *(uint *)(param_1 + 0x4c) = uVar12 + *(uint *)(param_1 + 0x4c);
  *(uint *)(param_1 + 0x48) = uVar13 + *(uint *)(param_1 + 0x48);
  *(uint *)(param_1 + 0x50) = uVar10 + *(uint *)(param_1 + 0x50);
  *(uint *)(param_1 + 0x54) = uVar11 + *(uint *)(param_1 + 0x54);
  *(uint *)(param_1 + 0x58) = uVar4 + *(uint *)(param_1 + 0x58);
  *(uint *)(param_1 + 0x5c) = uVar9 + *(uint *)(param_1 + 0x5c);
  *(uint *)(param_1 + 0x60) = uVar8 + *(uint *)(param_1 + 0x60);
  *(uint *)(param_1 + 100) = uVar15 + *(uint *)(param_1 + 100);
  if (**(int **)(DAT_00028784 + 0x28768) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


