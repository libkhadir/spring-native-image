FROM ghcr.io/graalvm/graalvm-ce:ol7-java17-22.3.0-b2 as compiler
COPY . /home/source/java
WORKDIR /home/source/java
RUN ./gradlew clean nativeCompile

FROM gcr.io/distroless/java17-debian11
COPY --from=compiler "/home/source/java/build/native/nativeCompile/spring-native-image" app
EXPOSE 8080
ENTRYPOINT ["/app"]
