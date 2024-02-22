MyBatis Generator Example

# 概要

３種類のテーブルからMyBatisのDaoを生成する実装例。

- normal_table : 単一主キーを持つ普通のテーブル
- nokey_with_blob : 主キーを持たないテーブル（blob列を含む)
- complexkey_table : 複合主キーを持つテーブル


# 使い方

postgresにテーブルを作成し、maven で Mybatis Generator プラグインを実行。

```shell
./mvnw mybatis-generator:generate
```
