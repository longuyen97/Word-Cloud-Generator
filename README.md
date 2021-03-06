<h1 align="center">R-Tree Cloud</h1>

### Screenshots

<table>
    <tr>
        <td><img src="data/shakespeare-output.png" width="500"/></td>
        <td><img src="data/obama-output.png" width="500"/></td>
    </tr>
    <tr>
        <td><img src="data/goethe-output.png" width="500"/></td>
        <td><img src="data/trump-output.png" width="500"/></td>
    </tr>
    <tr>
        <td><img src="data/vietnam-output.png" width="500"/></td>
        <td><img src="data/churchill-output.png" width="500"/></td>
    </tr>
</table>

### Algorithms
- Generate R-Tree index for rectangles
- Tokenize and count words
- Generate bounding box for each token
- Find free space for each token according to token's frequency.
- If no free space found, reduce font size.

### References
- [Immutable in-memory R-tree and R*-tree implementations in Java with reactive api](https://github.com/davidmoten/rtree)
- [Algorithm to implement a word cloud like Wordle](https://stackoverflow.com/questions/342687/algorithm-to-implement-a-word-cloud-like-wordle)
- [Kumo](https://github.com/kennycason/kumo)
- [Pretty Word Cloud](https://github.com/prettywordcloud/prettywordcloud.github.io)
- [Beautiful Visualization](https://www.oreilly.com/library/view/beautiful-visualization/9781449379889/)