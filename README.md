# Trapping rainwater

## Running

1. Via lein
```
lein run 3 1 2
```

2. Pakcage & run from jar
Build with :
```
lein uberjar
```
Run with:
```
java -jar target/uberjar/trapping-rainwater-0.1.0-SNAPSHOT-standalone.jar 3 1 2
```

## Development

```
lein test
```
3. Or continuously run tests with (reloads & runs tests when files change)
```
lein test-refresh
```
